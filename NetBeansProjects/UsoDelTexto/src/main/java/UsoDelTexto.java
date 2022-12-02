
public class UsoDelTexto {
  
    public static void main(String[] args) {
        
        String cad = "Que hongo manito"; 
        
        String cadMayus = convertirCadenaAMayusculas(cad);
       
        System.out.println(cadMayus);
        
    }

    public static String convertirCadenaAMayusculas(String val){
      
        String cadAux = "";
        for (int i = 0; i < val.length(); i++) {
            if(val.charAt(i) == ' '){
                cadAux += '-';
            }
                
            else{
                cadAux += Character.toUpperCase(val.charAt(i));
            }
        }
        
        return cadAux;
        
    }

}
