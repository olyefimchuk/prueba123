package Act7_8;

public class Main {

    public static void main(String[] args) {
        Sintonizador a = new Sintonizador(109);
        Sintonizador b = new Sintonizador(80);
        
        a.mostrarFrecuencia();
        a.up(); a.up(); a.up(); a.up();
        a.mostrarFrecuencia();
        a.down();
        a.mostrarFrecuencia();
        
        b.mostrarFrecuencia();
        b.down();
        b.mostrarFrecuencia();
        b.up(); b.up();
        b.mostrarFrecuencia();
        
    }
    
}
