
import javax.swing.JOptionPane;


public class Arreglos {
   
    public static void main(String[] args) {
        
        int val = Integer.parseInt(JOptionPane.showInputDialog("Elige el tamaño del " +  "arreglo"));
        
        int[] arreglo = new int[val];
        
        String cad = "";
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo [i] = (int)(Math.random()*100);
            cad += arreglo[i]+",";
            
        }
        
        JOptionPane.showInternalMessageDialog(null, cad);
        
        
        
    }
    
}
