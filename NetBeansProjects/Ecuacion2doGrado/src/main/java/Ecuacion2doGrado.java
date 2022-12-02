import java.util.Scanner;

public class Ecuacion2doGrado {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        float a,b,c;
        float x1, x2, discriminante;
        
        System.out.println("Ingresa el primer número de la ecuación:");        
        a = leer.nextFloat();
        
        System.out.println("Ingresa el segundo número de la ecuación:");
        b = leer.nextFloat();
                
        System.out.println("Ingresa el tercer número de la ecuación:");
        c = leer.nextFloat();
        
        discriminante = (b*b-4*a*c); 
        
        
        
    }
    
}
