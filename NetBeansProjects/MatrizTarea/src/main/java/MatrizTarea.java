import javax.swing.JOptionPane;

public class MatrizTarea {
    public static void main(String[] args) {
        
        int medida = Integer.parseInt(JOptionPane.showInputDialog(null, "¿De qué tamaño quieres la matriz nxn?(Tiene que ser un número impar)"));
        int matriz [][] = new int[medida + 1][medida + 1];
        
        for (int i = 1; i < medida + 1; i++) {
            for (int j = 1; j < medida+2-i; j++) {
            
                int x = medida+1-i;
                matriz[x][j] = (int) Math.pow(2,i);
                matriz[i][j] = (int) Math.pow(2,i);
                matriz[j][x] = (int) Math.pow(2,i);
                matriz[j][i] = (int) Math.pow(2,i);
            }
        
            for (int j = 1; j < medida+2-i; j++) {
            }
        
            for (int j = 1; j < medida+2-i; j++) {
            }
            
            for (int j = 1; j < medida+2-i; j++) {
                
            }
            
        }
        
        String cad = "";
        for (int i = 1; i < medida+1; i++) {
            for (int j = 1; j < medida+1; j++) {
                if (matriz[i][j]<10){
                    cad += " " + "0" + matriz[i][j] + " ";
                }
                else{
                    cad += " " + matriz[i][j] + " ";
                }
            }
        
            cad += " \n ";
        
        }
        
        JOptionPane.showMessageDialog(null,cad);
        
    }
}
