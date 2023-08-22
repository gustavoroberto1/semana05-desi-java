package Controllers;

import Models.Conta;
import Models.ContaCorrente;
import Models.ContaPoupanca;
import Models.ContaSalario;
import Models.Pessoa;
import Models.PessoaFisica;
import Models.PessoaJuridica;
import semana05.Semana05;

public class ContaController {
    
    public int criarConta(Pessoa titular, boolean corrente, boolean poupanca, boolean salario) {             
        Conta conta = corrente ? new ContaCorrente(titular): poupanca ? new ContaPoupanca(titular):  new ContaSalario(titular);
        Semana05.banco.add(conta);  
        return conta.getNumero();
    }
    
    public Conta buscarContaPorDocumentoTitular(String documento) {         
        for(Conta conta: Semana05.banco){
            if(conta.getTitular() instanceof PessoaFisica){
                PessoaFisica p = (PessoaFisica) conta.getTitular();
                if(p.getCpf().equals(documento)){
                    return conta;
                }
            }else if(conta.getTitular() instanceof PessoaJuridica){
                PessoaJuridica p = (PessoaJuridica) conta.getTitular();
                if(p.getCnpj().equals(documento)){
                    return conta;
                }
            }
        }    
        return null;
    }
}
