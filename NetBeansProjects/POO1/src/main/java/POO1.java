import javax.swing.JOptionPane;

public class POO1 {

    public static void main(String[] args) {
   
        Perro perro1 = new Perro("Millo",4);
        Perro perro2 = new Perro("Rambo");
        Perro perro3 = new Perro("Manchas",2.0f);
        
               
        if(perro1 != null)
        perro1.imprimirPerro();
        if(perro2 != null)
        perro2.imprimirPerro();
        if(perro3 != null)
        perro3.imprimirPerro();
        
        
    }
}

    class Perro {
        
        String nombre = "Firulais";
        String color = "Negro";
        String raza = "Labrador";
        float tamaño = 1.2f;
        String caracter = "Bravo";
        String colorOjos = "Verdes";
        int edad = 3;
    
        public Perro(){
            
        }
        
        public Perro(String n){
            nombre = n;
        }
        
        public Perro(String n, float t){
            nombre = n;
            tamaño = t;
        }
        
        public Perro(String n, int e){
            nombre = n;
            edad = e;
        }
        
        public void imprimirPerro(){
            JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nTamaño: " + tamaño + "\nEdad: " + edad);
        }
        
        public void ladrar (){
            JOptionPane.showMessageDialog(null, nombre + " dijo: ¡Guau!");
        }
        
        public void correr(){
            
        }
        
        public void sentarse(){
            
        }
        
        public void comer(){
            
        }
        
    }
    

