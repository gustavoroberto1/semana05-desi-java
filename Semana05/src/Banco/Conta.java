package Banco;

import java.util.Random;

public class Conta {

    public Conta(Pessoa titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.numero = this.gerarNumeroConta();      
    }   
    
    private int numero;
    private double saldo;
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
        if(valor > 0){
            this.saldo += valor;
            System.out.printf(this.titular.getNome() +" - Saldo após deposito: R$%.2f", this.saldo);
            System.out.println("");
        }else {
            System.out.println("O valor é inválido!");
        }
    }
    
    public void sacar(double valor){
        if(valor <= this.saldo && valor > 0){
             this.saldo -= valor;
             System.out.printf(this.titular.getNome() + " - Saldo após saque: R$%.2f", this.saldo);
             System.out.println("");
        }else {
            System.out.println("Valor inválido ou insuficiente para saque.");
        }
    }
    

    private int gerarNumeroConta() {
        Random random = new Random();
        return random.nextInt(90000) + 10000;
    }
}
