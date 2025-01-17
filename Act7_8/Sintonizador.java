package Act7_8;

public class Sintonizador {
    double frecuencia;
    
    // constructor
    public Sintonizador(double frec) {
        if (frec < 80) frecuencia = 80;
        else if (frec > 108) frecuencia = 108;
        else frecuencia = frec;
    }
    
    public Sintonizador() {
        this.frecuencia = 80;
    }
    
    public void up() {
        frecuencia += 0.5;
        if (frecuencia > 108) frecuencia = 80;
    }
    
    public void down() {
        frecuencia -= 0.5;
        if (frecuencia < 80) frecuencia = 108;
    }
    
    public void mostrarFrecuencia() {
        System.out.println("Frecuencia actual: " + frecuencia);
    }
    
    
}
