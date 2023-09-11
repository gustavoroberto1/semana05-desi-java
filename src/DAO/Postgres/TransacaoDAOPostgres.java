package DAO.Postgres;

import DAO.TransacaoDAO;
import Enums.TipoTransacao;
import Models.Conta;
import Models.Transacao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TransacaoDAOPostgres implements TransacaoDAO {

    private final Connection conexao;

    public TransacaoDAOPostgres(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void registrarTransacao(Transacao transacao) {
        String sql = "INSERT INTO transacao (id, data, tipo, valor, conta_id) VALUES (?, ?, CAST(? as tipo_transacao), ?, ?)";

        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setObject(1, transacao.getId());
            stm.setDate(2, new Date(transacao.getData().getTime()));
            stm.setString(3, transacao.getTipo().toString());
            stm.setDouble(4, transacao.getValor());
            stm.setObject(5, transacao.getContaId());

            stm.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    @Override
    public List<Transacao> buscarTransacoesPorConta(Conta conta) {
        String sql = "SELECT * FROM transacao WHERE conta_id = ?";

        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setObject(1, conta.getId());
            
            List<Transacao> transacoes = new ArrayList<>();

            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {
                UUID id = resultado.getObject("id", UUID.class);
                Date data = resultado.getDate("data");
                double valor = resultado.getDouble("valor");
                TipoTransacao tipo = TipoTransacao.valueOf(resultado.getString("tipo"));
                UUID contaId = resultado.getObject("conta_id", UUID.class);
                
                transacoes.add(new Transacao(id, data, valor, contaId, tipo));           
            }
            
            return transacoes;
        } catch (SQLException error) {
            System.out.println(error);
        }
        return null;
    }

}
