package Models;

import java.util.UUID;

public class ContaCorrente extends Conta {

    public ContaCorrente(Pessoa titular) {
        super(titular);
    }

    public ContaCorrente(UUID id, int numero, double saldo, Pessoa titular) {
        super(id, numero, saldo, titular);
    }

    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - (valor + (this.saldo * 0.10));
    }

}
