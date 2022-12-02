import java.util.Scanner;

public class NumerosPrimos {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num, a, contador=0;
        
        System.out.println("Dame un número:");
        num = scanner.nextInt();
        
        for (a=1; a<=num; a++ ){
            if (num % a == 0){
                contador++;
            }
        }
        
        if (contador !=2){
            System.out.println("Su número no es primo.");
        }
        else{
            System.out.println("Su número es primo.");
        }
    }
}
