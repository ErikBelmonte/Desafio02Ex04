package desafio02ex04;

import javax.swing.JOptionPane;

public class Desafio02Ex04 {
    public static void main(String[] args) {
        /*  Receba dois valores nas variáveis A e B respectivamente, troque o valor contido na
        variável A pelo valor em B, e o valor em B pelo valor em A, isto é, imprimiremos A e B com
        os valores trocados. */
        
        double A, B, T;
        
        A = Double.parseDouble(JOptionPane.showInputDialog("Dê um valor para A:"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Dê um valor para B:"));
        T = A;
        A = B;
        B = T;
            JOptionPane.showMessageDialog(null, "Os valores foram invertidos e ficou A: "+A+" e B: "+B);
        
        
    }
    
}
