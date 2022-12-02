
package Alumno;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class Alumno {
    private String alumnos[][]=new String [2][2];
   ArrayList<Materias> asignaturas = new ArrayList<Materias>();
    //Materias asignaturas[] = new Materias[2];
    
    Alumno(){
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[i].length; j++) {
                alumnos[i][j] = "";
            }
        }
    }
    
    public void menu(){
        int op =0;
        do{
            op =Integer.parseInt(JOptionPane.showInputDialog("1)Alta alumno\n 2)Asignar materias\n 0)Salir"));
            switch(op){
                case 1:
                    altas();
                    break;
                case 2:    
                    String noc = JOptionPane.showInputDialog("Número de Control");
                    Materias obj = new Materias();
                    
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while(true);
    
    }
    
    private void altas(){
        String datos[] = {"No. Control", "Nombre"};
        boolean correcto = false;
        for (int i = 0; i < alumnos.length; i++) {
           if (alumnos[i][0].equals("")){
               for (int j = 0; j < alumnos[i].length; j++) {
                  alumnos[i][j] = JOptionPane.showInputDialog("Escribe " + datos[j]); 
               }
               correcto = true;
               break;
           }
        
        }
        
        if (correcto) JOptionPane.showMessageDialog(null, "Alumno resgistrado");
        else JOptionPane.showMessageDialog(null, "No hay espacio");
    }
    
}
