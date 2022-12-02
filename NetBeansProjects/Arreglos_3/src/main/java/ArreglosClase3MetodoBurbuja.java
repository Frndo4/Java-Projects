import javax.swing.JOptionPane;

public class ArreglosClase3MetodoBurbuja {
 
    public static void main(String[] args) {
        
        int [] arreglo = {5,3,6,8,9,7,1,4,2,10};
        int [] arreglo2 = new int[arreglo.length];
        
        int aux ;
        for (int i = 0; i < arreglo.length-1; i++) {
            if(arreglo[i] > arreglo[i+1]){
                for (int j = i+1; j > 0; j--) {
                   if(arreglo[j] < arreglo[j-1]){
                       aux = arreglo[j];
                       arreglo [j] = arreglo [j-1];
                       arreglo [j-1] = aux;
                   } 
                }
            }
        }
    
        String cad = "";
        for (int i = 0; i < arreglo.length; i++) {
            cad += arreglo [i] + ",";
        }
    
        JOptionPane.showMessageDialog(null, cad);
    
    }
}
