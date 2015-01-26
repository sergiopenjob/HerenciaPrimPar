package herenciaprimpar;

import java.util.ArrayList;

public class Primos extends Numeros {

	private ArrayList<Integer> primos_cal = new ArrayList();
	
	public Primos(int ini, int fin) {
		super(ini, fin);
	}

	@Override
	public void calcular() {

		for (int i = ini; i <= fin; i++) {
			int num = 2;
			boolean primo = true;

			while (primo && num < i) {
				if (i % num == 0) {
					primo = false;
				}

				num++;
			}
			
			if(primo){
				primos_cal.add(i);
			}
		}
	}
	
	public void getPrimos_cal() {
		for(Integer primo : primos_cal){
			System.out.print(primo + " ");
		}
	}
}
