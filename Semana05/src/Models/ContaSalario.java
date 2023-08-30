package Models;

import java.util.UUID;

public class ContaSalario extends Conta {

    public ContaSalario(Pessoa titular) {
        super(titular);
    }

    public ContaSalario(UUID id, int numero, double saldo, Pessoa titular) {
        super(id, numero, saldo, titular);
    }

}
