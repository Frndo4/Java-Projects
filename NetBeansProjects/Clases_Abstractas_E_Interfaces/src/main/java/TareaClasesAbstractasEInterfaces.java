
import javax.swing.JOptionPane;


public class TareaClasesAbstractasEInterfaces {
  
    public static void main(String[] args) {
        
        
    }
    
}

abstract class EmpleadoEmpresa{
    
    public abstract void Sueldo();
        
    public abstract void Departamento(); 
    
    public void HorasDeTrabajo(){
        JOptionPane.showMessageDialog(null,"El trabajador labora 8 horas.");
    }
}

class Gerente extends EmpleadoEmpresa{
    
    String nombre = "Pancho";
    int edad = 58;
    
    public Gerente(){
        
        Sueldo();
        Departamento();
        
    }
    
    public void Sueldo(){
       JOptionPane.showMessageDialog(null,"Su sueldo es de $30,000");
    }
    
    public void Departamento(){
       JOptionPane.showMessageDialog(null,"Trabaja en el departamento de Finanzas");
    }
    
    public void HorasDeTrabajo(){
        
    }
    
}

class Secretario extends EmpleadoEmpresa{
    
    String nombre = "José";
    int edad = 40;
    
     public Secretario(){
        
        Sueldo();
        Departamento();
        
    }
     
    public void Sueldo(){
        JOptionPane.showMessageDialog(null,"Su sueldo es de $10,000");
    }
    
    public void Departamento(){
        JOptionPane.showMessageDialog(null,"Trabaja en el departamento de Recursos Humanos");
    }
    
    public void HorasDeTrabajo(){
        
    }
    
}



class Celular implements DispositivoElectronico{
    
    public Celular(){
        
    }
    
    public void jugar(){
        JOptionPane.showMessageDialog(null,"Jugar GTA en el celular.");
    }
    
    public void verRedesSociales(){
        JOptionPane.showMessageDialog(null,"Ver Facebook en el celular.");
    }
}

interface DispositivoElectronico{
  
    public void jugar();
    
    public void verRedesSociales();
    
}

class Ipad implements DispositivoElectronico{
    
    public Ipad(){
        
    }
    
    public void jugar(){
        JOptionPane.showMessageDialog(null,"Jugar GTA en el Ipad.");
    }
    
    public void verRedesSociales(){
        JOptionPane.showMessageDialog(null,"Ver Facebook en el Ipad.");
    }
    
}