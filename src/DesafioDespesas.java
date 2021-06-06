import java.util.Scanner;

public class DesafioDespesas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double luz;
		double agua;
		double internet;
		double mercado;

		System.out.println( "Informe o valor da conta de luz: ");
		luz = sc.nextDouble();
		System.out.println( "Informe o valor da conta de agua: ");
		agua = sc.nextDouble();
		System.out.println( "Informe o valor da conta de internet: ");
		internet = sc.nextDouble();
		System.out.println( "Informe o valor da conta de mercado: ");
		mercado = sc.nextDouble();

		double totalDespesas = luz + agua + internet + mercado;
	    int quantidadeDespesas = 4;
		double valorMediaDespesas = totalDespesas/quantidadeDespesas;

		System.out.println("Total de despesas: " + totalDespesas);
		System.out.printf("Total de despesas: %.2f", totalDespesas);
		System.out.printf("\nA media das despesas é: " + valorMediaDespesas);

		sc.close();
	}
}
