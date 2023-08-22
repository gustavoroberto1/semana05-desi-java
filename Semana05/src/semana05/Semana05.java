package semana05;

import Models.Conta;
import java.util.ArrayList;
import Views.Sistema;

public class Semana05 {
    
    // DB FAKE
    public static ArrayList<Conta> banco = new ArrayList<>();
    
    public static void main(String[] args) {
       new Sistema().setVisible(true);
    }
}
