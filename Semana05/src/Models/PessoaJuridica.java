package Models;

public class PessoaJuridica extends Pessoa {
    
    private String cnpj;
    
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
    

    @Override
    public boolean validaDocumento(String documento) {
        // VALIDA O CNPJ;
        return true;
    }
    
    
}
