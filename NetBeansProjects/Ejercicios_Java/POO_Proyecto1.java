
package prograavanzada_proyecto1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PrograAvanzada_Proyecto1 {

    static AlumnoTec[] listaAlumnos = 
                     new AlumnoTec[100];
    
    
    public static void main(String[] args) {
        
        while(true){
            int op = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Elige una opcion:\n"
                        +"1) Insertar nuevo alumno\n"
                        +"2) Modificar alumno\n"
                        +"3) Eliminar alumno\n"
                        +"4) Ver alumnos\n"
                        +"5) Salir"));
            
            switch(op){
                case 1:
                    insertarAlumno();
                    break;
                case 2:
                    modificarAlumno();
                    break;
                case 3:
                    eliminarAlumno();
                    break;
                case 4:
                    verAlumnos();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida");
                    break;
            }
        }
    }
    
    public static void insertarAlumno(){
        int noControl = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Inserta el NO Control:"));
        String nombre = JOptionPane.showInputDialog(
                                "Inserta el nombre");
        int semestre = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Inserta el Semestre:"));
        int promedio = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Inserta el Promedio:"));
        for (int i = 0; i < listaAlumnos.length; i++) {
            if(listaAlumnos[i] == null){
                listaAlumnos[i] = new AlumnoTec(
                        noControl,nombre,
                        promedio,semestre);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, 
                "El alumno fue insertado con exito");
        
    }
    
    public static void modificarAlumno(){
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el indice del usuario"));
        if(listaAlumnos[indice] != null){
            int noControl = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Inserta el NO Control:"));
            String nombre = JOptionPane.showInputDialog(
                                    "Inserta el nombre");
            int semestre = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Inserta el Semestre:"));
            int promedio = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Inserta el Promedio:"));
            
            listaAlumnos[indice] = new AlumnoTec(
                                    noControl,nombre,
                                    promedio,semestre);
        }
        else{
            JOptionPane.showMessageDialog(null, "No existe el alumno");
        }
    }
    
    public static void eliminarAlumno(){
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el indice del usuario"));
        listaAlumnos[indice] = null;
    }
    
    public static void verAlumnos(){
        for (int i = 0; i < listaAlumnos.length; i++) {
            if(listaAlumnos[i] != null){
                listaAlumnos[i].imprimir();
            }
        }
    }
}

class AlumnoTec{
    
    int numMaterias = 0;
    int noControl = 0;
    String nombre = "Sin Nombre";
    float promedioGeneral = 0;
    int semestre = 0;
    
    public AlumnoTec(){
        
    }
    
    public AlumnoTec(int noControl,
                        String nombre){
        this.noControl = noControl;
        this.nombre = nombre;
    }
    
    public AlumnoTec(int noControl,
                        String nombre,
                        float promedioGeneral,
                        int semestre){
        this.noControl = noControl;
        this.nombre = nombre;
        this.promedioGeneral = promedioGeneral;
        this.semestre = semestre;
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, 
                    "No Control: "+noControl
                    +"\nNombre: "+nombre
                    +"\nSemestre: "+semestre
                    +"\nPromedio General: "+ promedioGeneral);
    }
    
    
}

class Materia{
    String nombre = "";
    int promedio = 0;
}