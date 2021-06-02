import java.util.Scanner;

public class DesafioMediaIdade {

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
		int quantidadeIdades = 4;

		// System.out.println((idadePai + idadeMae + idadeIrmao + minhaIdade)/quantidadeIdades); 

		int somatoria = idadePai + idadeMae + idadeIrmao + minhaIdade;
		int mediaIdadeCasa = somatoria/quantidadeIdades;
		
		System.out.println();//pulando linha
		System.out.println("A idade media da sua casa é " +  mediaIdadeCasa + " anos "); 

		   //  System.out.println(10 + 23 + "12");
		  //  System.out.println("12" + 10 + 23);
		 //  System.out.println(10 + "12" + 23);
		//  System.out.println("12" + (10 + 23));

	}
}
