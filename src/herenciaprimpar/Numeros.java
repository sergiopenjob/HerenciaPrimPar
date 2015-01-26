/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaprimpar;

import java.util.ArrayList;

/**
 *
 * @author openjob
 */
public abstract class Numeros {
    private int ini;
    private int fin;
    
    public Numeros(int ini, int fin){
        this.ini = ini;
        this.fin = fin;
    }
    
    public abstract ArrayList<Integer> calcular(int ini, int fin);
}
