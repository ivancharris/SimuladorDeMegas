package cr.ac.ulead.main;
import java.io.PrintStream;
import java.util.Scanner;

public class simulador1 {

	private static Scanner input = new Scanner(System.in);
	private static PrintStream output = new PrintStream(System.out);

	public static void main(String[] args) {

		int dias, capIni = 0;
		int capDia = 7000;
		double sobrante = 10000, acumulador=0;

		
		output.println("Ingrese la cantidad de megas iniciales (día 0) ");
		sobrante= input.nextInt();
		output.println("Ingrese los días que desea simular ");
		dias= input.nextInt();

		output.println("Capacidad megas iniciales " + sobrante);
		output.println("Capacidad de consumo diario por usuarios " + capDia);
		output.println(" ");
		
		for (int i = 0; i <= dias; i++) {
			capIni=(int) sobrante;
			
			if (sobrante <= 28000) {
				sobrante = sobrante * 1.4;
			} else {
				sobrante = sobrante * 1.31;
			}
			acumulador=sobrante;
			sobrante = acumulador - capDia;
			
			
			output.println("Día " + (i));
			output.println("Capacidad de megas iniciales " + Math.round(capIni));
			output.println("Capacidad diaria agregada " + Math.round(acumulador));
			output.println("Capacidad para el día siguiente " + Math.round(sobrante));
			output.println(" ");
		}
		
		output.println("Memoría disponible para el día " + (dias+1)  +" es "+ Math.round(sobrante));

	}
}
