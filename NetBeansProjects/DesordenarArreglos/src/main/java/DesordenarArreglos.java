
import javax.swing.JOptionPane;


public class DesordenarArreglos {
   
    public static void main(String[] args) {
        
        int size = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es el tamaño que deseas para el arreglo?"));
        
        int arreglo [] = new int[size];
        int arreglo2 [] = new int [size]; //Declaras los arreglos.
                
        for (int a = 0; a < size; a++) { //Aquí se ordena el arreglo y se le asignan ceros al segundo arreglo.
            arreglo[a]=a;
            arreglo2[a]=0;
        }
        
        for (int a = 0; a < size; a++) { //Este es para la posición del primer arreglo.
            
            for (int b = 0; b < size; b++) { //Para buscar aleatoriamente la posición del segundo arreglo.
                
                int desorden = (int)(Math.random()*size); //Generar posiciones aleatorias.
                    
                    if(arreglo2[desorden] == 0){ //Este se usa para ver si la posición aleatoria está vacía.
                    arreglo2[desorden] = arreglo[a]; //Le da el valor al segundo arreglo en la posición aleatoria escogida y vacía.   
                    b = size; //Fuerza el fin del for.
                    }    
            }       
        }
        
        String cad = "";
        for (int a = 0; a < size; a++) { //Este se usa para unir todo el arreglo.
            cad +=  arreglo2[a] + ",";
        }
        
        JOptionPane.showMessageDialog(null, cad);
        
    }
    
}
