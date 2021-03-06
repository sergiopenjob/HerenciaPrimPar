package herenciaprimpar;

import java.util.ArrayList;

public class Pares extends Numeros {

    private ArrayList<Integer> pares_cal = new ArrayList();

    public Pares(int ini, int fin) {
        super(ini, fin);
        
        //chapuza para probar el setini
        try{
            this.setIni(ini);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void calcular() {

        for (int x = ini; x <= fin; x++) {
            if (x % 2 == 0) {
                pares_cal.add(x);
            }
        }
    }

    public void getPares_cal() {
        for (Integer par : pares_cal) {
            System.out.print(par + " ");
        }
    }
    
    @Override
    public void setIni(int ini) throws Exception{
        if(ini < 1000){
            this.ini = ini;
        }else{
            throw new Exception("El numero inicial debe ser menor a 1000");
        }
    }
}
