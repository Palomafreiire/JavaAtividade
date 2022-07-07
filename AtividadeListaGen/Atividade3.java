package AtividadeListaGen;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.println("\nComo você se chama? ");
		nome = ler.nextLine();
		System.out.println("\nQuantos anos você tem? ");
		idade = ler.nextInt();
		
		if (idade >=10 && idade<=14)
		{
			System.out.println("\nVocê é uma criança!!");
		}
		else if (idade >=15 && idade <=17)
		{
			System.out.println("\nVocê é um adolescente!!!");
		}
		else if (idade >=18 && idade <=25)
		{
			System.out.println("\nVocê já é adulto!!");
		}
		else
		{
			System.out.println("\nIdade invalida para nossas pesquisas \nDigite outra idade");
		}
		
				

	}

}
