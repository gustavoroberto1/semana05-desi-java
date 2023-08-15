package Banco;

public class Pessoa {

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        if(this.validaCPF(cpf)){
            this.cpf = cpf;
        }else {
            this.cpf = "000.000.000-00";
        }
        
    }
    
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }  
    
    private boolean validaCPF(String cpf){
        // VERIFICAR SE CPF É VALIDO
        return true;
    }
    
}
