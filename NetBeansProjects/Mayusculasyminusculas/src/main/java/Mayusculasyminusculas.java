import javax.swing.JOptionPane;

public class Mayusculasyminusculas {
    
    public static String nombrePropio(String cadena){
        String conversion = "";
            for(int a=0;a<cadena.length();a++){
            
                if (cadena.charAt(a) == ' '){//Encuentra el espacio
                    char letra = cadena.charAt(a+1);//Extrae la letra después del espacio.
                    conversion += " " + Character.toUpperCase(letra);//Convierte la letra a mayúscula.
                    a++;
                }
                else if(a == 0){//Agarra la primera letra del arreglo
                    char letra = cadena.charAt(a);
                    conversion += Character.toUpperCase(letra);//Convierte a mayúsculas.
                }
                else{//No encontró espacio o no es la primera letra.
                    char letra = cadena.charAt(a);//Pone la letra sin convertir.
                    conversion += letra; 
                }
            }
        
        return conversion;
    
    }
    
    public static String intercalarmayusyminus (String cadena){
        
        String conversion = "";
            for(int a=0;a<cadena.length();a++){
                char letra = cadena.charAt(a);//Extraer la letra del arreglo.
                                
                if (a==0){//Si es la posición 0 convierte a mayúscula.
                    conversion += Character.toUpperCase(letra);
                }
                else if(a%2 != 0){//Para que convierta los impares en minúscula.
                    conversion += Character.toLowerCase(letra);
                }
                else{
                    conversion += Character.toUpperCase(letra); //Para que los restantes sean mayúsculas
                }
            }
        
        return conversion;
        
    }
    
    public static void main(String[] args) {
        
        String valor = null;//Aquí se pone un valor nulo para que pueda entrar el JOptionPane
        
        String funcion =  JOptionPane.showInputDialog(null, "Escribe la función:");//Aquí el ususario escribe como cuál programa quiere mandar llamar
        
        String cadena = JOptionPane.showInputDialog(null, "Escribe tu texto");//Aquí el usuario escribe el texto para realizar el programa
        
        if("Nombre propio".equals(funcion)){//Aquí se manda llamar a la función del programa nombre propio
            valor = nombrePropio(cadena);
        }
        
        if ("Intercalar mayúsculas y minúsculas".equals(funcion)){//Aquí se manda llamar la función intercalar mayúsculas y minúsculas
            valor = intercalarmayusyminus(cadena);
        }
    
        JOptionPane.showMessageDialog(null, valor);//En esta parte se manda llamar al valor hecho por el código que mandamos llamar
    
    }
}
