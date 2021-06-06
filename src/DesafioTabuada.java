import java.util.Scanner;

public class DesafioTabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o numero da tabuada a ser calculada: ");

		int numTab = sc.nextInt();
		sc.close();
		// for
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " * " + numTab + " = " + (numTab * i));
		}

		// while
		int j = 0; //verifica se é vdd p poder executa 
		while (j < 11) { //teste logico no inicio
			System.out.print(j + " * " + numTab + " = " + (numTab * j));
			j++;
		}

		// do while
		int k = 0;
		do { //  ele executa uma vez e depois verifica
			System.out.print(k + " * " + numTab + " = " + (numTab * k));
			k++;
		} while (k < 11); //teste logico no final
	}
}