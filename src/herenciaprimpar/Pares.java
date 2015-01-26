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
public class Pares extends Numeros{

    public Pares(int ini, int fin) {
        super(ini, fin);
    }

    @Override
    public ArrayList<Integer> calcular(int ini, int fin) {
        ArrayList<Integer> numeros = new ArrayList();
        
        for(int x=ini; x<=fin; x++){
            if(x%2 == 0){
                numeros.add(x);
            }
        }
        
        return numeros;
    }
    
}
