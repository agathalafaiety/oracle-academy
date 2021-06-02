import java.util.Scanner;

public class DesafioNotaAluno {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a nota do primeiro trimestre: ");
		double nota1 = sc.nextInt();
		System.out.print("Digite a nota do segundo trimestre: ");
		double nota2 = sc.nextInt();
		System.out.print("Digite a nota do segundo trimestre: ");
		double nota3 = sc.nextInt();
		System.out.println();//pulando linha
		double mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
		
		System.out.print("A sua nota final é: " + mediaPonderada);  
		
		sc.close();	
	}
}    
	