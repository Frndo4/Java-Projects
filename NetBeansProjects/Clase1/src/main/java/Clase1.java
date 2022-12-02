
import javax.swing.JOptionPane;


public class Clase1 {
    
    public static void main(String[] args) {
        
    byte num1 = 127;
    short num2 = 16789;
    int num3 = 18987192;
    long num4 = new Long ("16389123862256652221221");
    
    float flotante1 = 3.1415f;
    double flotante2 = 7.19723914;
    
    boolean bandera = false;
    
    char caracter = 98;
        System.out.println("Character: "+caracter);
    
    String cad = "Hola";
    String cad2 ="Hermano";
        System.out.println(cad+" "+cad2);
    
        int x = 10;
        int y = 12;
        int z = x+y;
        
        if (z < 100){
            
            JOptionPane.showMessageDialog(null, "z es menor que 100");
            
        }
        
        else {
            
            JOptionPane.showMessageDialog(null, cad2);
            
        }
    }
}
