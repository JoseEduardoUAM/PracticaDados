package practicadados;

public class Histograma {
    
    private int datos [];
    
    public Histograma( int datos [] ){
        this.datos = datos;
    }
    
    public void dibujarHistograma(){
        System.out.println( "SUMA" + "\t\t" + "PORCENTAJE" );       
        for(int i = 0 ; i < datos.length ; i++){            
            int r = ( datos[i] * 100 ) / 100000000;
            float t = ( (float)datos[i] * 100 ) / 100000000;           
            System.out.print( (i+3) + "\t\t" + t + "%" + "\t\t" );
            for(int j = 0 ; j < r ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
