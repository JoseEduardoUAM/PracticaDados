package practicadados;

public class Gestor {
    
    private int datos [];
    private Dado d1 , d2 , d3;
    private Histograma h;
    
    public Gestor(){
    }
    
    public void agregarDados( int numeroCaras ){
        int n = (3*numeroCaras) - 2;
        datos = new int[n];
        d1 = new Dado(numeroCaras);
        d2 = new Dado(numeroCaras);
        d3 = new Dado(numeroCaras);
    }
    
    public void lanzarDados(){
        for(int i = 0 ; i < datos.length ; i++){
            datos[i] = 0;
        }        
        for(int i = 0 ; i < 100000000 ; i++){
            int r = d1.girar() + d2.girar() + d3.girar();
            datos[ r - 3 ] += 1;
        }       
    }
    
    public void mostrarFrecuencia(){
        System.out.println("SUMA" + "\t\t" + "FRECUENCIA");
        for(int i = 0 ; i < datos.length ; i++){
            System.out.println( (i+3) + "\t\t" + datos[i] );
        }
        System.out.println();
    }
    
    public void mostrarHistograma(){
        h = new Histograma( datos );
        h.dibujarHistograma();
    }
    
}
