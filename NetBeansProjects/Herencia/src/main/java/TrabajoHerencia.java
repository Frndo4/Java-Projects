
public class TrabajoHerencia {

}

class Animal{
        
        public int peso = 0;
        public String comportamiento = "";
        public int promDeVida = 0;
    
    public void nacer(){
    }
    
    public void dormir(){
    }
    
    public void crecer(){
    }
    
    public void hidratarse(){
    }
    
    public void caminar(){
    }
    
    public void respirar(){
    }
    
    public void reproducirse(){
    }
    
    public void comunicarse(){
    }
    
    public void morir(){
    }

    public Animal(int peso, String comportamiento, int promDeVida){
        
        this.peso = peso;
        this.comportamiento = comportamiento;
        this.promDeVida = promDeVida;
        
    }
    
}



class Insecto extends Animal{
 
    int numDePatas =  0;
    boolean alas = true;
    String tipoOjos = "";
    
    public Insecto (int peso, String comportamiento, int promDeVida, int numDePatas, boolean alas, String tipoOjos){
        
        super(peso,comportamiento, promDeVida);
        
        this.numDePatas = numDePatas;
        this.alas = alas;
        this.tipoOjos = tipoOjos;
        
    }
    
    @Override
    public void crecer(){
        
    }
    
    public void comer(){
        
    }
    
}


class Escarabajo extends Insecto{
    
    String alimentacion = "";
    
    public Escarabajo (int peso, String comportamiento, int promDeVida, int numDePatas, boolean alas, String tipoOjos, String alimentacion){
    
        super(peso, comportamiento, promDeVida, numDePatas, alas, tipoOjos);
        
        this.alimentacion = alimentacion;
        
    }
    
    @Override
    public void caminar(){
        
    }
    
}


class Abeja extends Insecto{
    
    boolean antenas = true;
    
    public Abeja (int peso, String comportamiento, int promDeVida, int numDePatas, boolean alas, String tipoOjos, boolean antenas){
        
        super(peso, comportamiento, promDeVida, numDePatas, alas, tipoOjos);
        
        this.antenas = antenas;
        
    }
    
    public void polinizar(){
     
    }
    
}



class Mamifero extends Animal{
    
    String tipo;
    int tamaño;
    
    public Mamifero (int peso, String comportamiento, int promDeVida, String tipo, int tamaño){
        
        super(peso,comportamiento, promDeVida);
          
        this.tipo = tipo;
        this.tamaño = tamaño;  
        
    }
    
    public void comer(){
    }
    
    public void correr(){
    }
    
    @Override
    public void comunicarse(){
    }
    
}


class Ballena extends Mamifero{
    
    int edad = 0;
    
    public Ballena(int peso, String comportamiento, int promDeVida, String tipo, int tamaño, int edad){
        
        super(peso, comportamiento, promDeVida, tipo, tamaño);
        
        this.edad = edad;
        
    }
    
    @Override
    public void comunicarse(){
        
    }
    
    public void nadar(){
        
    }
    
}

class Delfin extends Mamifero{
    
    boolean amigable = true;
    
    public Delfin(int peso, String comportamiento, int promDeVida, String tipo, int tamaño, boolean amigable){
    
        super(peso, comportamiento, promDeVida, tipo, tamaño);
        
        this.amigable = amigable;
        
    }
    
    public void jugar(){
        
    }
    
    @Override
    public void comunicarse(){
        
    }
    
}



class Ave extends Animal{
    
    String colorPlumas;
    boolean sociable;
    
    public Ave(int peso, String comportamiento, int promDeVida, String tipo, int tamaño, String colorPlumas, boolean sociable){
        
        super(peso,comportamiento, promDeVida);
        
        this.colorPlumas = colorPlumas;
        this.sociable = sociable;
        
    }
    
    public void socializar(){
        
    }
    
    @Override
    public void reproducirse(){
        
    }
    
}

class Guacamaya extends Ave{
    
    String color;
    boolean cautiverio;
    
    public Guacamaya(int peso, String comportamiento, int promDeVida, String tipo, int tamaño, String colorPlumas, boolean sociable, 
                            String color, boolean cautiverio){
       
        super(peso, comportamiento, promDeVida, tipo, tamaño, colorPlumas, sociable);
        
        this.color = color;
        this.cautiverio = cautiverio;
        
    }
    
    public void volar(){
        
    }
    
    @Override
    public void dormir(){
        
    }
    
}

class Carpintero extends Ave{
    
    String alimentación;
    boolean trepar;
    
    public Carpintero(int peso, String comportamiento, int promDeVida, String tipo, int tamaño, String colorPlumas, boolean sociable,
                            String alimentación, boolean trepar){
        
        super(peso, comportamiento, promDeVida, tipo, tamaño, colorPlumas, sociable);
        
        this.alimentación = alimentación;
        this.trepar = trepar;
        
    }
    
    public void trepar(){
        
    }
    
    @Override
    public void nacer(){
        
    }
    
}