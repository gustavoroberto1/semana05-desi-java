package semana05;

import Banco.Conta;
import Banco.Pessoa;
import java.util.ArrayList;

public class Semana05 {

    public static void main(String[] args) {
        ArrayList<Conta> banco = new ArrayList<>();
        
        Pessoa pUm = new Pessoa("Gustavo", "999.999.999-99");
        Pessoa pDois = new Pessoa("Maçaneiro", "888.888.888.88");
        Pessoa pTres = new Pessoa("Filipe", "777.777.777-77");
        
        banco.add(new Conta(pUm));
        banco.add(new Conta(pDois));
        banco.add(new Conta(pTres));
        
                
        banco.get(0).depositar(1000.0);
      
        for(Conta conta: banco){
            conta.depositar(100.0);
        }
        
        banco.get(0).sacar(500.0);
        banco.get(2).sacar(80.0);
        
        
    }
    
}
