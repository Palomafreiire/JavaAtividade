package AtividadeListaGen;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int n1; 
		int n2;
		int n3;
		
		
		System.out.println("\nEntre com o primeiro número");
		n1 = ler.nextInt();
		System.out.println("\nEntre com o segundo número");
		n2 = ler.nextInt();
		System.out.println("\nEntre com o terceiro número");
		n3 = ler.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("\nO primeiro número é maior!!");
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("\nO segundo número é maior!!");
		}
		else if (n3>n1 && n3>n2)
		{
			System.out.println("\nO terceiro número é maior!!");
		}
			
		
	}

}
