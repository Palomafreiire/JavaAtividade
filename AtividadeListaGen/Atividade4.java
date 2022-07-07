package AtividadeListaGen;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int n1;
		double valor;
		
		System.out.println("\nEntre com um número: ");
		n1 = ler.nextInt();
		
		if (n1 % 2 ==0)
		{
			valor = Math.sqrt(n1);
		}
		else
		{
			 valor = Math.pow(n1, 2);
		}
		
		System.out.printf("\n o valor é: %.2f", valor);
	}

}
