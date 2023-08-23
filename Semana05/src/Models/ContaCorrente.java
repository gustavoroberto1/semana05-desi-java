package Models;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(Pessoa titular) {
        super(titular);
    } 

    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - (valor + (this.saldo * 0.10));
    }
     
}
