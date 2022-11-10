package es.jmpp.prog.aves;

public class Pajaro {
    private String nombre;
    private int posx = 0, posy = 0;
    
    public Pajaro(){
        
    }
    
    public Pajaro(String nombre){
        this.nombre = nombre;
    }

    
    
    public Pajaro(String nombre, int x, int y){
        this.nombre = nombre;
        this.posx = x;
        this.posy = y;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }
    
    public double volar(int despX, int despY) {
        double distancia = Math.sqrt(despX * despX + despY * despY);
        this.posx += despX;
        this.posy += despY;
        return distancia;
    }
}
