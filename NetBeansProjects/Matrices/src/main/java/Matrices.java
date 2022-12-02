import javax.swing.JOptionPane;

public class Matrices {
   
    public static void main(String[] args) {
   
        int [][] arreglo = new int [5][8];
        
        String cad = "";
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                //arreglo[i][j] = (i*arreglo[i].length+j+1);
                arreglo [j][i] = i*j;
                if (arreglo[i][j] < 10);{
                    cad += "0" + arreglo[i][j]+" | ";
                }             
                           
            }
            
            cad += "\n";
            
        }
        
        JOptionPane.showMessageDialog(null, cad);
        
    }
}
