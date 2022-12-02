import javax.swing.JOptionPane;

public class ArreglosClase2 {
  
    public static void main(String[] args) {
        
        int [] arreglo = new int [100];
        int [] arreglo2 = new int[arreglo.length];
        
        for (int i = 0; i < arreglo.length; i++){
            arreglo [i] = (int)(Math.random()*100000);
            
        }
        
        String cad = "";
        
        for (int j = 0; j < arreglo.length; j++){
            System.out.println(""+j);
        int min = 1000000000;
        int indMin = 0;
        
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] < min && arreglo[i] != -1){
                min = arreglo[i];
                indMin = i;
            }
            
        }
        
            arreglo2[j] = min;
            arreglo[indMin] = -1;
            //cad += arreglo2[j]+",";
        }
   
        //JOptionPane.showMessageDialog(null, "Acabo");
        
    }
    
}
