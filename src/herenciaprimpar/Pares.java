package herenciaprimpar;

import java.util.ArrayList;

public class Pares extends Numeros {

    private ArrayList<Integer> pares_cal = new ArrayList();

    public Pares(int ini, int fin) {
        super(ini, fin);
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
}
