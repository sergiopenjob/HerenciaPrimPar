package herenciaprimpar;

import java.util.ArrayList;

public abstract class Numeros {
    protected int ini;
    protected int fin;
    
    public Numeros(int ini, int fin){
        this.ini = ini;
        this.fin = fin;
    }
    
    public abstract void calcular();
}
