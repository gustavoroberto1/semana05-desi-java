package Models;

import java.util.Random;

public class Conta {

    public Conta(Pessoa titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.numero = this.gerarNumeroConta();
    }

    private int numero;
    double saldo;
    private Pessoa titular;

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void transferir(Conta destinatario, double valor) {

        this.saldo -= valor;
        destinatario.saldo += valor;

    }

    private int gerarNumeroConta() {
        Random random = new Random();
        return random.nextInt(90000) + 10000;
    }
}
