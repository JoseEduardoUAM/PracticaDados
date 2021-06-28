package practicadados;

public class Dado {
    
    private Cara caras [];
    
    public Dado( int caras ){
        this.caras = new Cara[caras];
        llenado();
    }
    
    public void llenado(){
        for(int i = 0 ; i < caras.length ; i++ ){
            caras[i] = new Cara();
            caras[i].setValor(i+1);
        }
    }
    
    public int girar(){
        return caras[ (int)(Math.random() * caras.length + 0) ].getValor() ;
    }
    
}
