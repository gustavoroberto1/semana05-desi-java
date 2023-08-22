package Controllers;

import Models.Pessoa;
import Models.PessoaFisica;
import Models.PessoaJuridica;

public class PessoaController {
    
    public Pessoa criarPessoa(String nome, String documento, String tipo){       
        if(tipo.equals("Pessoa Física")){
            return new PessoaFisica(nome, documento);
        } 
        return  new PessoaJuridica(nome, documento);
    }
    
}
