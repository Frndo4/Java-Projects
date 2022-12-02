import java.util.Scanner;

import javax.swing.JOptionPane;
public class SeriedeFibonacci {
   
    public static void main(String[] args) {
        
       int num1=0, num2=1, sum=0;
       
       String conCad = JOptionPane.showInputDialog("¿Hasta cuál Fibonacci quieres?");
       int con = Integer.parseInt(conCad); 
        
       String cad = "";
       cad += num1+"\n";
       cad += num2+"\n";
       for(int i = 2; i< con; i++){
           sum = num1+num2;
           num1 = num2;
           num2 = sum;
           cad += sum+"\n";
       }
        
        JOptionPane.showMessageDialog(null, cad);
       
    }
    
}
