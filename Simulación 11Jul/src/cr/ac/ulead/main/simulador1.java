package cr.ac.ulead.main;
import java.io.PrintStream;
import java.util.Scanner;

public class simulador1 {

	private static Scanner input = new Scanner(System.in);
	private static PrintStream output = new PrintStream(System.out);

	public static void main(String[] args) {

		int dias, capIni;
		int capDia = 7000;
		double capExt = 0;
		double acumulador,sobrante = 0,capSig = 0;

		
		output.println("Ingrese la cantidad inicial (día 0) ");
		capIni= input.nextInt();
		output.println("Ingrese los días que desea simular ");
		dias= input.nextInt();
		
		if (capIni <= 28000) {
			capExt = capIni * 1.4;
		} else {
			capExt = capIni * 1.31;
		}
		

		output.println("Capacidad megas iniciales " + capIni);
		output.println("Capacidad de consumo diario por usuarios " + capDia);
		output.println("Capacidad diaria agregada " + capExt);
		output.println(" ");
		
		for (int i = 1; i <= dias; i++) {
			sobrante = capExt - capDia;
			
			
			if (sobrante <= 28000) {
				capExt = sobrante * 1.4;
			} else {
				capExt = sobrante * 1.31;
			}
			
			output.println("Día " + i);
			output.println("Capacidad diaria agregada " + Math.round(capExt));
			output.println("Capacidad para el día siguiente " + Math.round(sobrante));
			output.println(" ");
		}
		

		output.println("Memoría disponible para el día " + (dias+1)  +" es "+ sobrante);

	}
}
