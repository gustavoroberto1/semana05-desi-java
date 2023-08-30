package Models;

import java.util.UUID;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Pessoa titular) {
        super(titular);
    }

    public ContaPoupanca(UUID id, int numero, double saldo, Pessoa titular) {
        super(id, numero, saldo, titular);
    }

}
