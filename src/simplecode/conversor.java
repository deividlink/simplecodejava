package simplecode;

import javax.swing.JOptionPane;

public class conversor {
    public static void main(String[] args) {
        double  c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Temperatura(Celsius)", "Conversor de Temperatura", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null,"°F = ( " + c +"°C * 1,8) + 32" + "\nFahrenheit: " + ((c * 1.8)+32) + "°F" , "Temperatura em Fahrenheit", JOptionPane.PLAIN_MESSAGE);
    }
}
