import java.util.Scanner;

public class DesafioAnoNascimento02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é a sua idade? ");
		int minhaIdade = sc.nextInt();
		
		int anoNascimento = 2021 - minhaIdade;
		System.out.println("Voce nasceu em: " + anoNascimento);
		
		sc.close();
	}
}

