package herenciaprimpar;

import java.util.ArrayList;

public abstract class Numeros {

    protected int ini;
    protected int fin;

    public Numeros(int fin){
        this.ini = 2;
        this.fin = fin;
    }
    
    public Numeros(int ini, int fin) {
        this.ini = ini;
        this.fin = fin;
    }

    public abstract void calcular();

    private int getIni() {
        return ini;
    }

    protected void setIni(int ini) throws Exception{
        if(ini > 0){
            this.ini = ini;
        }else{
            throw new Exception("El numero inicial debe ser mayor que cero");
        }
    }

    private int getFin() {
        return fin;
    }

    private void setFin(int fin) {
        this.fin = fin;
    }
    
    
}
