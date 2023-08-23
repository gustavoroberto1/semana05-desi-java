package semana05;

import Models.Conta;
import Util.GerenciadorConexao;
import java.util.ArrayList;
import Views.Sistema;
import java.util.UUID;

public class Semana05 {
    
    // DB FAKE
    public static ArrayList<Conta> banco = new ArrayList<>();
    
    public static void main(String[] args) {
        new Sistema().setVisible(true);
    }
}
