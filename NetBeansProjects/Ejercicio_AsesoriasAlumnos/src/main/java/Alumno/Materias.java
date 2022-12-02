
package Alumno;

import javax.swing.JOptionPane;


public class Materias {
    private String materias[][] = new String[2][5];
    
    Materias(){
        for (int i = 0; i < materias.length; i++) {
            for (int j = 0; j < materias[i].length; j++) {
                materias[i][j] = "";
                
            }
        }
    }
    
    public void altaMaterias(String noc){
        String datos[] = {"", "M1", "M2", "M3", "M4"};
        boolean correcto = false;
        for (int i = 0; i < materias.length; i++) {
            if(materias[i][0].equals("")){
                materias[i][0] = noc;
                for (int j = 1; j < materias[i].length; j++) {
                    materias[i][j] = JOptionPane.showInputDialog("Escribe " + datos[j]);
                }
                correcto = true;
                break;
            }
        }
    
        if (correcto) JOptionPane.showMessageDialog(null, "Materias resgistradas");
        else JOptionPane.showMessageDialog(null, "Error");
        
    }
}
