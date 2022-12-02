import javax.swing.JOptionPane;

public class POO2 {
 
 static AlumnoTecMasChido[] listaAlumnos = new AlumnoTecMasChido[100];
 
 public static void main(String[] args) {
     
    

        while(true){
       
            int op = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:\n" + "1)Insertar nuevo alumno:\n" + "2)Modificar alumno\n" + "3)Insertar materia\n" + "4)Eliminar alumno\n" + "5)Ver alumnos\n" + "6)Salir"));
            
            switch(op){
            
                case 1:
                    insertarAlumno();
                    break;
                case 2:
                    modificarAlumno();
                    break;
                case 3:
                    insertarMateria();
                    break;
                case 4:    
                    eliminarAlumno();
                    break;    
                case 5:
                    verAlumnos();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }    
              
        }    
        
    }

    public static void insertarMateria(){
       
        String nombre = JOptionPane.showInputDialog("Inserta el nombre de la materia:");
        float promedio = Float.parseFloat(JOptionPane.showInputDialog("Dame el promedio de la materia:")); 
        
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Dame el índice del alumno al que quieres agregar la materia con su respectivo promedio"));
        if (indice > listaAlumnos.length){
            JOptionPane.showMessageDialog(null, "Ese alumno no existe");
        }
        else{
            if(listaAlumnos[indice].numMaterias > 10){
                JOptionPane.showMessageDialog(null, "Ya no se pueden meter más materias");
            }
            
            else{
                for (int j = 0; j < 10; j++) {
                    if(listaAlumnos[indice].materias[j] == null){
                        listaAlumnos[indice].materias[j] = new Materia(nombre,promedio);
                        listaAlumnos[indice].numMaterias++;
                        JOptionPane.showMessageDialog(null, "Agregadas con éxito");
                        break;
                        
                    }
                }
            }
            
        }
        
    }
    
      
    public static void insertarAlumno(){
        int noControl = Integer.parseInt(JOptionPane.showInputDialog("Inserta el No. de Control:"));
        String nombre = JOptionPane.showInputDialog("Inserta el nombre:");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Inserta el No. de Semestre:"));
        int promedioGeneral = Integer.parseInt(JOptionPane.showInputDialog("Inserta el No. de Promedio:"));
        String especialidad = JOptionPane.showInputDialog("¿Qué especialidad le gustaría cursar o está cursando?");
        int noDeCongresosAsistidos = Integer.parseInt(JOptionPane.showInputDialog
                                                                    ("Inserta el número de congresos que el alumno ha asistido:"));
        int creditosComplementarios = Integer.parseInt(JOptionPane.showInputDialog("Inserta el No. de créditos complementarios:"));
        int asistenciaAClase = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas veces ha asistido a clase?"));
        
        
        for (int i = 0; i < listaAlumnos.length; i++) {
            if(listaAlumnos[i] == null){
                listaAlumnos[i] = new AlumnoTecMasChido(noControl, nombre, promedioGeneral, semestre, especialidad, noDeCongresosAsistidos, 
                        creditosComplementarios,asistenciaAClase);
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El alumno fue insertado con éxito");
        
    }
    
    public static void verAlumnos(){
        for (int i = 0; i < listaAlumnos.length; i++) {
            if(listaAlumnos [i] != null){
                listaAlumnos[i].imprimirNuevo();
                if (listaAlumnos[i].numMaterias == 0){
                    JOptionPane.showMessageDialog(null, "No hay materias registradas");
                }
                if (listaAlumnos[i] != null){
                    for (int j = 0; j < 10; j++) {
                        if (listaAlumnos[i].materias[j] != null){
                            listaAlumnos[i].materias[j].imprimirMateria();
                        }
                    }
                }
                
            }
        }
    }
    
     public static void modificarAlumno(){
        
        int modificar = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué alumno deseas modificar?"));
        
        if(listaAlumnos[modificar] != null){
        int noControl = Integer.parseInt(JOptionPane.showInputDialog("Inserta el No. de Control:"));
        String nombre = JOptionPane.showInputDialog("Inserta el nombre:");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Inserta el No. de Semestre:"));
        int promedio = Integer.parseInt(JOptionPane.showInputDialog("Inserta el No. de Promedio:")); 
        String especialidad = JOptionPane.showInputDialog("¿Qué especialidad le gustaría cursar o está cursando?");
        int noDeCongresosAsistidos = Integer.parseInt(JOptionPane.showInputDialog
                                                                    ("Inserta el número de congresos que el alumno ha asistido:"));
        int creditosComplementarios = Integer.parseInt(JOptionPane.showInputDialog("Inserta el No. de créditos complementarios:"));
        int asistenciaAClase = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas veces ha asistido a clase?"));        
        
        listaAlumnos[modificar] = new AlumnoTecMasChido(noControl, nombre, promedio, 
                semestre, especialidad, noDeCongresosAsistidos, creditosComplementarios,asistenciaAClase);
        }
        
        else{
            JOptionPane.showMessageDialog(null, "No existe el alumno.");
        }
    
    }
    
    public static void eliminarAlumno(){
        
        int eliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué número de alumno deseas eliminar?"));
         listaAlumnos[eliminar] = null;
        
    } 
     
}

class AlumnoTec{
    
    int numMaterias = 0;
    int noControl = 0;
    String nombre = "Sin Nombre";
    float promedioGeneral = 0;
    int semestre = 0;
    Materia[] materias = new Materia[10];   

    public AlumnoTec(int numMaterias){
        
       this.numMaterias = numMaterias; 
        
    }
    
    public AlumnoTec (int noControl, String nombre, float promedioGeneral, int semestre){
        
        this.noControl = noControl;
        this.nombre = nombre;
        this.promedioGeneral = promedioGeneral;
        this.semestre = semestre;
        
    }
    
    public void imprimir(){
        
        JOptionPane.showMessageDialog(null, "No. Control: " + noControl + "\nNombre: " + nombre + "\nSemestre: " + 
                                            semestre + "\nPromedio General: " + promedioGeneral);
        
    }
    
}

    class Materia{
        String nombre = "";
        float promedio = 0;
    
        public Materia(String nombre, float promedio){
            this.nombre = nombre;
            this.promedio = promedio;
        }
        
        public void imprimirMateria(){
          
            JOptionPane.showMessageDialog(null, "Materia: " + nombre + "\nPromedio de la materia: " + promedio);
            
        }
        
    }


    class AlumnoTecMasChido extends AlumnoTec{
        
        String especialidad = "";
        int noDeCongresosAsistidos = 0;
        int creditosComplementarios = 0;
        int asistenciaAClase = 0;
        
    public AlumnoTecMasChido (int noControl, String nombre, float promedioGeneral, int semestre ,
            String especialidad, int noDeCongresosAsistidos,int creditosComplementarios, int asistenciaAClase){
        
        super(noControl, nombre, promedioGeneral, semestre);
        
        this.especialidad = especialidad;
        this.noDeCongresosAsistidos = noDeCongresosAsistidos;
        this.creditosComplementarios = creditosComplementarios;
        this.asistenciaAClase = asistenciaAClase;
        
    }
        
    public void imprimirNuevo(){
        
        JOptionPane.showMessageDialog(null, "No. Control: " + noControl + "\nNombre: " + nombre + "\nSemestre: " + 
                                            semestre + "\nPromedio General: " + promedioGeneral + "\nEspecialidad: " + especialidad + 
                                        "\nNo. de congresos asistidos: " + noDeCongresosAsistidos + "\nCréditos complementarios: " + 
                                        creditosComplementarios + "\nNo. de asistencias: " + asistenciaAClase);
        
    }
    
    } 