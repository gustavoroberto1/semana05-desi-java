package Models;

import java.util.UUID;

public class Pessoa {

    public Pessoa(String nome) {
        this.nome = nome;
        this.id = UUID.randomUUID();
    }
    
    private UUID id;
    private String nome;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public boolean validaDocumento(String documento){
        return true;
    }
    
}
