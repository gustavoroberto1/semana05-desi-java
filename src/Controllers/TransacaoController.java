package Controllers;

import Enums.TipoTransacao;
import static Factory.FactoryDAO.makeTransacao;
import Models.Conta;
import Models.Transacao;
import java.util.List;
import java.util.UUID;

public class TransacaoController {

    public void criarTransacao(double valor, TipoTransacao tipo, UUID contaId) {
        Transacao transacao = new Transacao(valor, contaId, tipo);
        makeTransacao().registrarTransacao(transacao);
    }

    public List<Transacao> buscarTransacoes(Conta conta) {
        return makeTransacao().buscarTransacoesPorConta(conta);
    }
}
