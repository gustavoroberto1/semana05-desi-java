package semana05;

import Banco.Conta;
import java.util.ArrayList;
import view.Sistema;

public class Semana05 {
    
    // DB FAKE
    public static ArrayList<Conta> banco = new ArrayList<>();
    
    public static void main(String[] args) {
       new Sistema().setVisible(true);
    }
}
