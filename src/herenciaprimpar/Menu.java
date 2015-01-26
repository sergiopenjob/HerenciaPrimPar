package herenciaprimpar;

import java.util.Scanner;

public class Menu {

	private final Scanner scn = new Scanner(System.in);
	private final int SALIR_MENU = 3;
	private final int SALIR_FUNC = 0;

	public void menuMain() {
		int menu = 0;

		do {
			mostrarMenu();
			menu = scn.nextInt();
			ejecutarMenu(menu);
		} while (menu != SALIR_MENU);

		System.out.println("Hasta luego!");
	}

	public void mostrarMenu() {
		limpiarPantalla();
		System.out.println("JAVA CONSOLA");
		System.out.println("1. Num Pares");
		System.out.println("2. Num Primo");
		System.out.println("3. Salir");
		System.out.println("Seleccione opcion [1-3] : ");
	}

	public void ejecutarMenu(int menu) {
		int ini, fin;

		limpiarPantalla();

		try{
			switch (menu) {
				case 1:
					System.out.println("Escriba el numero de comienzo");
					ini = scn.nextInt();
					System.out.println("Escriba el numero de fin");
					fin = scn.nextInt();

					Pares pares = new Pares(ini, fin);
					pares.calcular();
					pares.getPares_cal();
					continuar();
					
					break;

				case 2:
					System.out.println("Escriba el numero de comienzo");
					ini = scn.nextInt();
					System.out.println("Escriba el numero de fin");
					fin = scn.nextInt();

					Primos primos = new Primos(ini, fin);
					primos.calcular();
					primos.getPrimos_cal();
					continuar();
					
					break;
			}
		} catch (Exception ex) {
			System.out.println("Los datos recibidos son incorrectos");
		}
	}

	public void limpiarPantalla() {
		for (int i = 0; i <= 25; i++) {
			System.out.println();
		}
	}

	public void continuar() {
		int continuar;

		do {
			System.out.println("\n\nPulse 0 para continuar...");
			continuar = scn.nextInt();
		} while (continuar != SALIR_FUNC);

		limpiarPantalla();
	}
}
