
import javax.swing.JOptionPane;


public class CajeroAutomatico {
    
        static Cliente[] listaClientes = new Cliente[100];
        
        public static void main(String[] args) {
        
            
        while(true){
       
            int op = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:\n" + "1)Insertar cliente:\n" + "2)Consultar saldo\n" + "3)Retirar dinero\n" + "4)Salir"));
            
            switch(op){
            
                case 1:
                    insertarCliente();
                    break;
                case 2:
                    consultarSaldo();
                    break;
                case 3:
                    retirarDinero();
                    break;
                case 4:    
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }    
        }    
    }
        
    public static void insertarCliente(){

    int Id = Integer.parseInt(JOptionPane.showInputDialog("Inserta el Id:"));
    String nombre = JOptionPane.showInputDialog("Inserta el nombre:");
    int Nip = Integer.parseInt(JOptionPane.showInputDialog("Inserta el Nip:"));
    float Saldo = Float.parseFloat(JOptionPane.showInputDialog("Inserta el Saldo:"));
        
        for (int i = 0; i < listaClientes.length; i++) {
            if(listaClientes[i] == null){
                listaClientes[i] = new Cliente(Id, nombre, Nip, Saldo);
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El cliente fue insertado con éxito");

    }    
    
    public static void consultarSaldo(){
        
        int Id = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame tu Id:"));
        int Nip = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe tu Nip"));
        
        for (int i = 0; i < listaClientes.length; i++) {
            
            if(listaClientes[i] != null){
            if(listaClientes[i].Id == Id && listaClientes[i].Nip == Nip){
                JOptionPane.showMessageDialog(null, "Usuario correcto" + "\nTu saldo es de: " + listaClientes[i].Saldo);
                                         
            }else{
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            }
            
            }
        
        }
    
    }

    public static void retirarDinero(){
        
        int Id = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame tu Id:"));
        int Nip = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe tu Nip"));
        float nuevoSaldo = 0;
        
        for (int i = 0; i < listaClientes.length; i++) {
            
            if(listaClientes[i] != null){
            if(listaClientes[i].Id == Id && listaClientes[i].Nip == Nip){
                JOptionPane.showMessageDialog(null, "Usuario correcto" + "\nTu saldo es de: " + listaClientes[i].Saldo);
                   
                int retirar = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto quieres retirar"));
                if(retirar < listaClientes[i].Saldo){
                    nuevoSaldo = listaClientes[i].Saldo - retirar;
                    JOptionPane.showMessageDialog(null, "Tu saldo actual es de: " + nuevoSaldo);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "No cuentas con la cantidad suficinte");
                }
                                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            }
            
            }
        
        }
        
    }
    
    
}

class Cliente{
    
    int Id = 0;
    String nombre = "Sin Nombre";
    int Nip = 0;
    float Saldo = 0; 
    
    public Cliente (int Id, String nombre, int Nip, float Saldo){
    
        this.Id = Id;
        this.nombre = nombre;
        this.Nip = Nip;
        this.Saldo = Saldo;
        
    }
    
    public void imprimirSaldo(){
        
        JOptionPane.showMessageDialog(null, "Saldo: " + Saldo);
        
    }
    
}