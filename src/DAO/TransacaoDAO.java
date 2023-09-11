package DAO;

import Models.Transacao;
import Models.Conta;
import java.util.List;

public interface TransacaoDAO {
    public void registrarTransacao(Transacao transacao);
    public List<Transacao> buscarTransacoesPorConta(Conta conta);
}
