package simplecode;

import javax.swing.JOptionPane;
import java.time.LocalDate;
public class Entrada {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int ano = date.getYear();
        int x = response();
        String msg ="Ano Atual: "+ ano + " - " + "Ano de Nascimento: " + x + " = " + "\nIdade: " + (ano - x);
        JOptionPane.showMessageDialog(null, msg, "Sua Idade", JOptionPane.PLAIN_MESSAGE);
    }
    
    
public static int response(){
    String ent = JOptionPane.showInputDialog(null, "Digite o Ano do Seu Nascimento", "Ano de Nascimento", JOptionPane.INFORMATION_MESSAGE);
    if(ent.isEmpty()){response();}
    int result = Integer.parseInt(ent);
    return result;
    }
}