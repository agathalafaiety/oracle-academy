import java.util.Scanner;

public class DesafioAnoNascimento01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Em que ano voce nasceu? ");
		int anoNascimento = sc.nextInt();
		
		if(anoNascimento > 2021) {
			System.out.println("Seu ano de nascimento é do futuro ");	
		} else {
			int idadeAtual = 2021 - anoNascimento;
			System.out.println("Voce tem: " + idadeAtual + " anos");
		}
		sc.close();
	}
}