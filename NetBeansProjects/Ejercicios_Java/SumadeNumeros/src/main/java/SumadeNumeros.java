import java.util.Scanner;

public class SumadeNumeros {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2, resultado;
        
        System.out.println("Escribe tu primer número:");
            num1 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Escribe tu segundo número:");
            num2 = Integer.parseInt(scanner.nextLine());
            
        System.out.println("El resultado es = " + (num1 + num2));    
            
    }
    
}
