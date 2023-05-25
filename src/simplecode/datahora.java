package simplecode;

import javax.swing.JOptionPane;

public class datahora {
    public static void main(String[] args) {
        Data data = new Data();
        Hora hora = new Hora();   
        String msg = data.getData() + " - " + hora.getHoras(); 
        JOptionPane.showMessageDialog(null,msg, msg, JOptionPane.PLAIN_MESSAGE);

    }
    

}
