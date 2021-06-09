import java.util.Scanner;

public class DesafioSomatoriaIdade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int minhaIdade = sc.nextInt();
		
		System.out.println();//pulando linha
		System.out.print("Digite a idade da sua mãe: ");
		int idadeMae = sc.nextInt();
		
		System.out.println();//pulando linha
		System.out.print("Digite a idade do seu pai: ");
		int idadePai = sc.nextInt();
		
		System.out.println();//pulando linha
		System.out.print("Digite a idade do seu irmão: ");
		int idadeIrmao = sc.nextInt();
		
		System.out.println();//pulando linha
		int somatoria = idadePai + idadeMae + idadeIrmao + minhaIdade;
		System.out.println("A soma das idade da sua familia é: " + somatoria);
		
		sc.close();
	}
}
