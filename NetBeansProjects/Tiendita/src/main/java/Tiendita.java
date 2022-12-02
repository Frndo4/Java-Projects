import javax.swing.JOptionPane;

public class Tiendita {
    
    static Producto[] listaProductos = new Producto[100];
    static Producto[] compras = new Producto[100];
    static int totalPagar = 0;    
    
    public static void main(String[] args){
        
        int op = 0;
        while(true){
            try{
            op = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion: \n\n"
                    + "1) Agregar producto\n2) Modificar producto\n3) Eliminar producto\n4) Poner producto en oferta\n5)Ver productos\n"
                    + "6) Comprar productos\n7)Ver carrito\n8) Pagar en caja\n9) Salir"));
            
            }catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error detectado.\n" + "Debes escribir un número del 1-8 según la opción que deseas.");
            }
            
            switch(op){
                case 1:
                    insertarProducto();
                    break;
                case 2:
                    modificarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    añadirOferta();
                    break;
                case 5:
                    verProductos();
                    break;
                case 6:
                    comprarProducto();
                    break;
                case 7:
                    verCarrito();
                    break;
                case 8:
                    verTotal();
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
            
            
        }
    
       
    }
    
    public static void verCarrito(){
        
        String cad = "";
        
        cad += "PRODUCTO" + "      " + "CANTIDAD" + "        " + "PRECIO" + "\n";
        
        for (int j = 0; j < compras.length; j++) {
            if(compras[j] != null){
                cad += compras[j].nombre + "                       " + compras[j].comprar + "                       " + 
                        compras[j].ofertaChida + "\n\n";
                
            }
        }
        
               
        JOptionPane.showMessageDialog(null, cad);
        
    }
    
    public static void añadirOferta(){
        
        String cad = "";
        for (int i = 0; i < listaProductos.length; i++) {
            if(listaProductos[i] != null){
                
                cad = "Producto "+i+":\n\n";
                if(listaProductos[i] instanceof Comestible){
                    Comestible comestible = (Comestible)listaProductos[i];
                    
                    cad += listaProductos[i].id + "\n";
                    cad += "Nombre: " + comestible.nombre + "\n";
                    cad += "Precio: " + comestible.precio + "\n\n";
                    
                    if(listaProductos[i].precioOferta == 0){
                        cad += "Precio con oferta: " + " No está en oferta" + "\n\n";
                    }
                    else{
                        cad += "Precio con oferta: " + comestible.precioOferta + "\n\n";
                    }
                }
                else if(listaProductos[i] instanceof Computadora){
                    Computadora computadora = (Computadora)listaProductos[i];
                   
                    cad += listaProductos[i].id + "\n";                    
                    cad += "Nombre: " + computadora.nombre + "\n";
                    cad += "Precio: " + computadora.precio + "\n\n";
                    
                    if(listaProductos[i].precioOferta == 0){
                        cad += "Precio con oferta: " + " No está en oferta" + "\n\n";
                    }
                    else{
                        cad += "Precio con oferta: " + computadora.precioOferta + "\n\n";
                    }
                } 
                else if(listaProductos[i] instanceof Jardín){
                    Jardín jardín = (Jardín)listaProductos[i];
                    
                    cad += listaProductos[i].id + "\n"; 
                    cad += "Nombre: " + jardín.nombre + "\n";
                    cad += "Precio: " + jardín.precio + "\n\n";
                    
                     if(listaProductos[i].precioOferta == 0){
                        cad += "Precio con oferta: " + " No está en oferta" + "\n\n";
                    }
                    else{
                        cad += "Precio con oferta: " + jardín.precioOferta + "\n\n";
                    }
                }
                 else if(listaProductos[i] instanceof Deporte){
                    Deporte deporte = (Deporte)listaProductos[i];
                    
                    cad += listaProductos[i].id + "\n";
                    cad += "Nombre: " + deporte.nombre + "\n";
                    cad += "Precio: " + deporte.precio + "\n\n";
                    
                    if(listaProductos[i].precioOferta == 0){
                        cad += "Precio con oferta: " + " No está en oferta" + "\n\n";
                    }
                    else{
                        cad += "Precio con oferta: " + deporte.precioOferta + "\n\n";
                    }
                 } 
                    
                JOptionPane.showMessageDialog(null, cad);
            }
            
        }
        
        try{
        int id = Integer.parseInt(JOptionPane.showInputDialog("Inserta el id del producto"));
       
        for (int i = 0; i < listaProductos.length; i++) {
            if(listaProductos[i] != null){
                if(listaProductos[i].id == id){
                    
                    int oferta = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el nuevo precio del producto?"));
                    
                    listaProductos[i].precioOferta = oferta;
                    
                    
                }
            }
        }
        }
        catch(NumberFormatException a){
            JOptionPane.showMessageDialog(null, "Error detectado.\n" + "Se debe insertar un número entero.");
        }
    }
    
    
    public static void insertarProducto(){
        
        try{
        int id = Integer.parseInt(JOptionPane.showInputDialog("Inserta el id del producto"));
        String nombre = JOptionPane.showInputDialog("Inserta el nombre del producto");
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Inserta el precio del producto"));
        int existencias = Integer.parseInt(JOptionPane.showInputDialog("Inserta las existencias del producto"));
        
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("De que tipo es el producto:\n\n"
                                            + "1)Comestible\n2)Computadora\n3)Jardín\n4)Gimnasio"));
        switch(tipo){
            case 1:
                String fechaCad = JOptionPane.showInputDialog("Inserta la fecha de caducidad:");
                String contenidoNeto = JOptionPane.showInputDialog("Inserta el contenido neto del producto");
                Comestible comestible = new Comestible(id, nombre, precio, existencias, fechaCad, contenidoNeto);
                for (int i = 0; i < listaProductos.length; i++) {
                    if(listaProductos[i] == null){
                        listaProductos[i] = comestible;
                        break;
                    }
                }
                break;
            case 2:
                String velProc = JOptionPane.showInputDialog("Inserta la velocidad de procesamiento:");
                String memFisica = JOptionPane.showInputDialog("Inserta la memoria fisica:");
                String memRAM = JOptionPane.showInputDialog("Inserta la memoria RAM:");
                String tarjetaGraf = JOptionPane.showInputDialog("Inserta la Tarjeta Grafica:");
                Computadora computadora = new Computadora(id, nombre, precio, existencias, velProc, memFisica, memRAM, tarjetaGraf);
                for (int i = 0; i < listaProductos.length; i++) {
                    if(listaProductos[i] == null){
                        listaProductos[i] = computadora;
                        break;
                    }
                }
                break;
            case 3:
                String planta = JOptionPane.showInputDialog("¿Qué planta es?");
                String lugar = JOptionPane.showInputDialog("¿La planta es de sol o sombra?");
                
                Jardín jardín = new Jardín(id, nombre, precio, existencias, planta, lugar);
                for (int i = 0; i < listaProductos.length; i++) {
                    if(listaProductos[i] == null){
                        listaProductos[i] = jardín;
                        break;
                    }
                }
                break;
            case 4:
                String tipoDeMaquina = JOptionPane.showInputDialog("¿Qué tipo de máquina de ejercicio deseas comprar?");
                String tamañoDeMaquina = JOptionPane.showInputDialog("¿Qué tan grande en cuanto a espacio deseas la máquina?");
                               
                Deporte deporte = new Deporte(id, nombre, precio, existencias, tipoDeMaquina, tamañoDeMaquina);
                for (int i = 0; i < listaProductos.length; i++) {
                    if(listaProductos[i] == null){
                        listaProductos[i] = deporte;
                        break;
                    }
                }
                break;
        }
        
        JOptionPane.showMessageDialog(null, "Producto insertado exitosamente");
    
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error detectado.\n" + "Recuerda que:\n" + "-Id\n" + "-Precio\n" + "-Existencias\n"
                    + "-El tipo de mercancía\n" + "Deber ser números enteros.");
        }
    
    }
    
    public static void modificarProducto(){
        
        try{        
        int id = Integer.parseInt(JOptionPane.showInputDialog("Inserta el id del producto"));
        
        for (int i = 0; i < listaProductos.length; i++) {
            if(listaProductos[i] != null){
                if(listaProductos[i].id == id){
            
        String nombre = JOptionPane.showInputDialog("Inserta el nombre del producto");
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Inserta el precio del producto"));
        int existencias = Integer.parseInt(JOptionPane.showInputDialog("Inserta las existencias del producto"));
        
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("De que tipo es el producto:\n\n"
                                            + "1)Comestible\n2)Computadora\n3)Jardín\n4)Gimnasio"));
        switch(tipo){
            case 1:
                String fechaCad = JOptionPane.showInputDialog("Inserta la fecha de caducidad:");
                String contenidoNeto = JOptionPane.showInputDialog("Inserta el contenido neto del producto");
                Comestible comestible = new Comestible(id, nombre, precio, existencias, fechaCad, contenidoNeto);
                
                        listaProductos[i] = comestible;
                        break;
                    
                
                
            case 2:
                String velProc = JOptionPane.showInputDialog("Inserta la velocidad de procesamiento:");
                String memFisica = JOptionPane.showInputDialog("Inserta la memoria fisica:");
                String memRAM = JOptionPane.showInputDialog("Inserta la memoria RAM:");
                String tarjetaGraf = JOptionPane.showInputDialog("Inserta la Tarjeta Grafica:");
                Computadora computadora = new Computadora(id, nombre, precio, existencias, velProc, memFisica, memRAM, tarjetaGraf);
                
                        listaProductos[i] = computadora;
                        break;
                    
            case 3:
                String planta = JOptionPane.showInputDialog("¿Qué planta es");
                String lugar = JOptionPane.showInputDialog("¿La planta es de sol o sombra?");
                
                Jardín jardín = new Jardín(id, nombre, precio, existencias, planta, lugar);
                
                        listaProductos[i] = jardín;
                        break;
                    
            case 4:
                String tipoDeMaquina = JOptionPane.showInputDialog("¿Qué tipo de máquina de ejercicio deseas comprar?");
                String tamañoDeMaquina = JOptionPane.showInputDialog("¿Qué tan grande en cuanto a espacio deseas la máquina?");
                                
                Deporte deporte = new Deporte(id, nombre, precio, existencias, tipoDeMaquina, tamañoDeMaquina);
               
                        listaProductos[i] = deporte;
                        break;
                    
        }
                
        JOptionPane.showMessageDialog(null, "Producto insertado exitosamente");
               break;
                
               }
            
        }else if(i == listaProductos.length-1){
                    
            JOptionPane.showMessageDialog(null, "No existe el producto");
                    
        }
       
    }
        }catch(Exception error){
             JOptionPane.showMessageDialog(null, "Error detectado.\n" + "Recuerda que:\n" + "-Id\n" + "-Precio\n" + "-Existencias\n"
                    + "-El tipo de mercancía\n" + "Deber ser números enteros.");
        }
    }
    
    public static void eliminarProducto(){
        
        try{
        int id = Integer.parseInt(JOptionPane.showInputDialog("Inserta el id del producto"));
            
        for (int i = 0; i < listaProductos.length; i++){
            if(listaProductos[i] != null){
                if(listaProductos[i].id == id){
                
                    
                    listaProductos[i] = null;
                      
                    JOptionPane.showMessageDialog(null, "Producto eliminado");
                    break;
                }
                
            }
                
        }
        
        }catch(NumberFormatException d){
            JOptionPane.showMessageDialog(null, "Error detectado.\n" + "Se debe introducir un número entero.");
        }
        
    }
    
    public static void verProductos(){
        String cad = "";
        for (int i = 0; i < listaProductos.length; i++) {
            if(listaProductos[i] != null){
                
                cad = "Producto "+i+":\n\n";
                if(listaProductos[i] instanceof Comestible){
                    Comestible comestible = (Comestible)listaProductos[i];
                    cad += "Id: " + comestible.id + "\n";
                    cad += "Nombre: " + comestible.nombre + "\n";
                    cad += "Precio: " + comestible.precio + "\n";
                    cad += "Existencias: " + comestible.existencias + "\n";
                    
                    if(listaProductos[i].precioOferta == 0){
                        cad += "Precio con oferta: " + " No está en oferta" + "\n\n";
                    }
                    else{
                        cad += "Precio con oferta: " + comestible.precioOferta + "\n\n";
                    }
                    cad += "Fecha Caducidad: " + comestible.fechaCaducidad + "\n";
                    cad += "Contenido Neto: " + comestible.contenigoNeto + "\n";
                
                }
                else if(listaProductos[i] instanceof Computadora){
                    Computadora computadora = (Computadora)listaProductos[i];
                    cad += "Id: " + computadora.id + "\n";
                    cad += "Nombre: " + computadora.nombre + "\n";
                    cad += "Precio: " + computadora.precio + "\n";
                    cad += "Existencias: " + computadora.existencias + "\n";
                    
                    if(listaProductos[i].precioOferta == 0){
                        cad += "Precio con oferta: " + " No está en oferta" + "\n\n";
                    }
                    else{
                        cad += "Precio con oferta: " + computadora.precioOferta + "\n\n";
                    }
                    
                    cad += "Velocidad Procesador: " + computadora.velProcesador + "\n";
                    cad += "Memoria Fisica: " + computadora.memoriaFisica + "\n";
                    cad += "Memoria RAM: " + computadora.memoriaRAM + "\n";
                    cad += "Tarjeta Grafica: " + computadora.tarjetaGraficos + "\n";
                }
                
                else if(listaProductos[i] instanceof Jardín){
                    Jardín jardín = (Jardín)listaProductos[i];
                    cad += "Id: " + jardín.id + "\n";
                    cad += "Nombre: " + jardín.nombre + "\n";
                    cad += "Precio: " + jardín.precio + "\n";
                    cad += "Existencias: " + jardín.existencias + "\n";
                   
                    if(listaProductos[i].precioOferta == 0){
                        cad += "Precio con oferta: " + " No está en oferta" + "\n\n";
                    }
                    else{
                        cad += "Precio con oferta: " + jardín.precioOferta + "\n\n";
                    }
                    
                    cad += "Tipo de planta: " + jardín.plantas + "\n";
                    cad += "Es de sol o de sombra: " + jardín.solOSombra + "\n";
                }
                
                else if(listaProductos[i] instanceof Deporte){
                    Deporte deporte = (Deporte)listaProductos[i];
                    cad += "Id: " + deporte.id + "\n";
                    cad += "Nombre: " + deporte.nombre + "\n";
                    cad += "Precio: " + deporte.precio + "\n";
                    cad += "Existencias: " + deporte.existencias + "\n";
                    
                    if(listaProductos[i].precioOferta == 0){
                        cad += "Precio con oferta: " + " No está en oferta" + "\n\n";
                    }
                    else{
                        cad += "Precio con oferta: " + deporte.precioOferta + "\n\n";
                    }
                    
                    cad += "Nombre máquina: " + deporte.tipoMaquina + "\n";
                    cad += "Tamaño de la máquina: " + deporte.tamañoMaquina + "\n";
                    
                }
                
                JOptionPane.showMessageDialog(null, cad);
            }
            
        }
    }
    
    public static void comprarProducto(){
        
        String cad = "";
        for (int i = 0; i < listaProductos.length; i++) {
            if(listaProductos[i] != null){
                
                cad = "Producto "+i+":\n\n";
                if(listaProductos[i] instanceof Comestible){
                    Comestible comestible = (Comestible)listaProductos[i];
                    
                    cad += listaProductos[i].id + "\n";
                    cad += "Nombre: " + comestible.nombre + "\n";
                    cad += "Precio: " + comestible.precio + "\n";
                    cad += "Existencias: " + comestible.existencias + "\n";
                    
                    if(listaProductos[i].precioOferta == 0){
                        cad += "Precio con oferta: " + " No está en oferta" + "\n\n";
                    }
                    else{
                        cad += "Precio con oferta: " + comestible.precioOferta + "\n\n";
                    }
                }
                
                else if(listaProductos[i] instanceof Computadora){
                    Computadora computadora = (Computadora)listaProductos[i];
                   
                    cad += listaProductos[i].id + "\n";                    
                    cad += "Nombre: " + computadora.nombre + "\n";
                    cad += "Precio: " + computadora.precio + "\n";
                    cad += "Existencias: " + computadora.existencias + "\n";
                    
                    if(listaProductos[i].precioOferta == 0){
                        cad += "Precio con oferta: " + " No está en oferta" + "\n\n";
                    }
                    else{
                        cad += "Precio con oferta: " + computadora.precioOferta + "\n\n";
                    }
                } 
                
                else if(listaProductos[i] instanceof Jardín){
                    Jardín jardín = (Jardín)listaProductos[i];
                    
                    cad += listaProductos[i].id + "\n"; 
                    cad += "Nombre: " + jardín.nombre + "\n";
                    cad += "Precio: " + jardín.precio + "\n";
                    cad += "Existencias: " + jardín.existencias + "\n";
                    
                     if(listaProductos[i].precioOferta == 0){
                        cad += "Precio con oferta: " + " No está en oferta" + "\n\n";
                    }
                    else{
                        cad += "Precio con oferta: " + jardín.precioOferta + "\n\n";
                    }
                }
                
                else if(listaProductos[i] instanceof Deporte){
                    Deporte deporte = (Deporte)listaProductos[i];
                    
                    cad += listaProductos[i].id + "\n";
                    cad += "Nombre: " + deporte.nombre + "\n";
                    cad += "Precio: " + deporte.precio + "\n";
                    cad += "Existencias: " + deporte.existencias + "\n";
                    
                    if(listaProductos[i].precioOferta == 0){
                        cad += "Precio con oferta: " + " No está en oferta" + "\n\n";
                    }
                    else{
                        cad += "Precio con oferta: " + deporte.precioOferta + "\n\n";
                    }
                 } 
                    
                JOptionPane.showMessageDialog(null, cad);
            }
            
        }
        
        try{
        int id = Integer.parseInt(JOptionPane.showInputDialog("¿Qué índice de artículo deseas comprar?"));
        int comprar = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas unidades deseas comprar?"));
                
               
        for (int i = 0; i < listaProductos.length; i++) {
            if(listaProductos[i] != null){
                if(listaProductos[i].id == id){
                    if(listaProductos[i].existencias >= comprar){ 
                    
                    listaProductos[i].existencias = listaProductos[i].existencias - comprar; 
                    
                    listaProductos[i].ofertaChida = listaProductos[i].precio;
                    
                    if(listaProductos[i].precioOferta != 0){
                        listaProductos[i].ofertaChida = listaProductos[i].precioOferta;
                    }
                                        
                    totalPagar += listaProductos[i].ofertaChida*comprar;
                    
                    JOptionPane.showMessageDialog(null, "Agregado al carrito");
                    
                    for(int j = 0; j < compras.length; j++){
                        if (compras[j] == null){
                            compras[j] = listaProductos[i];
                            compras[j].comprar = comprar;
                            break;
                        }
                    }
                    
                    break;
                    
                    }else{
                
                    JOptionPane.showMessageDialog(null, "No hay tantos artículos en existencia");
                    break;
                    
                    }
                
                } 
                    
            }
            
        }
        
        }catch(NumberFormatException c){
            JOptionPane.showMessageDialog(null, "Error detectado.\n" + "Se deben introducir números enteros.");
        }
        
    }
    
    public static void verTotal(){
        
        try{
        
        JOptionPane.showMessageDialog(null, "Tu total a pagar es de: " + totalPagar);
        
        int pago = Integer.parseInt(JOptionPane.showInputDialog("¿Con cuánto va a pagar? (En efectivo)"));
        
        JOptionPane.showMessageDialog(null, "Recibo: " + pago);
        int cambio = pago - totalPagar;
        
        JOptionPane.showMessageDialog(null, "Tu cambio es de: " + cambio);
        
        JOptionPane.showMessageDialog(null, "Le entrego su ticket.");
        
        String cad = "";
        cad += "MI TIENDITA\n";
        cad += "Ciudad de México, Av. Reforma, #2522\n";
        cad += "Núm. Teléfono: 4432563255\n";
        cad += "06/05/2020\n\n";
        cad += "PRODUCTO" + "      " + "CANTIDAD" + "        " + "PRECIO" + "\n";
        
        for (int j = 0; j < compras.length; j++) {
            if(compras[j] != null){
                cad += compras[j].nombre + "                       " + compras[j].comprar + "                       " + 
                        compras[j].ofertaChida + "\n\n";
                
            }
        }
        
        cad += "TOTAL A PAGAR:    " + totalPagar + "\n";
        cad += "RECIBIÓ:          " + pago + "\n";
        cad += "CAMBIO:           " + cambio;
    
        JOptionPane.showMessageDialog(null, cad);
      
        }catch(NumberFormatException b){
            JOptionPane.showMessageDialog(null, "Error detectado.\n" + "Favor de ingresar números enteros.");
        }
        
    }
    
}    

class Producto{
    int id;
    String nombre;
    int precio;
    int existencias;
    int precioOferta;
    int ofertaChida;
    int comprar;
    
}

class Comestible extends Producto {
    String fechaCaducidad;
    String contenigoNeto;
    
    public Comestible(int id, String nombre,int precio,int existencias,String fechaCad,String contNeto){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
        fechaCaducidad = fechaCad;
        contenigoNeto = contNeto;
    }
}

class Computadora extends Producto {
    String velProcesador;
    String memoriaFisica;
    String memoriaRAM;
    String tarjetaGraficos;
    
    public Computadora(int id, String nombre,int precio,int existencias,String velProc, String memFisica, 
                                                                            String memRAM, String graficos){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
        velProcesador = velProc;
        memoriaFisica = memFisica;
        memoriaRAM = memRAM;
        tarjetaGraficos = graficos;
    }
}

class Jardín extends Producto {
    
    String plantas;
    String solOSombra;
    
    public Jardín(int id, String nombre,int precio,int existencias, String planta, String lugar){
        
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
        plantas = planta;
        solOSombra = lugar;
        
    }
    
}

class Deporte extends Producto {
    
    String tipoMaquina;
    String tamañoMaquina;
    
    
    public Deporte(int id, String nombre,int precio,int existencias, String tipoDeMaquina, String tamañoDeMaquina){
        
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
        tipoMaquina = tipoDeMaquina;
        tamañoMaquina = tamañoDeMaquina;
        
        
    }
    
}
