import javax.swing.JOptionPane;

public class Ejercicio1Clase {
   
    public static void main(String[] args) {
        
        int [] arreglo = {5,3,12,8,9,0,4,2,7,10,20};
        int sum = 0;
        int mult = 1;
        int max = arreglo[0];
        int min = arreglo[0];
        int a;
        
        String cadena = "";  //Esto significa que la cadena está vacía.
        
        for (a=0; a < arreglo.length; a++){
            sum += arreglo [a]; //Aquí se utilizó el operador "+=" que al hacer la suma se asigne nuevamente al valor de sum,
        
        if (a % 2 == 0)   
            mult *= arreglo[a];
        
        if (max < arreglo[a])
            max = arreglo[a];
        
        if (min > arreglo[a])
            min = arreglo[a];
        
        }
        
        JOptionPane.showMessageDialog(null, "Suma = " + sum);
        JOptionPane.showMessageDialog(null, "Multiplicación = " + mult);
        JOptionPane.showMessageDialog(null, "Valor mínimo = " + min);
        JOptionPane.showMessageDialog(null, "Valor máximo = " + max);
        
    }
}
