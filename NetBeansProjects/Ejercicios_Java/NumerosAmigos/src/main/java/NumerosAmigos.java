import java.util.Scanner;

public class NumerosAmigos {
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    int numero1, numero2, a, contador=0;
        
        System.out.println("Dame tu primer número:");
        numero1 = scanner.nextInt();
        
        System.out.println("Dame tu segundo número:");
        numero2 = scanner.nextInt();
    
        for (a = 1; a < numero1; a++){
            if(numero1 % a ==0){
                contador = contador + a;//(Se podría usar contador += a, es lo mismo.)
            }
        }
        
        if (contador == numero2){
            contador=0;
            for(a = 1; a < numero2; a++){
                if(numero2 % a == 0){
                    contador = contador + a;
                }
            }
        }
        
        if (contador == numero1){
            System.out.println("Los números son amigos.");
        }
        else{
            System.out.println("Los números no son amigos.");
        }
    }    
}
