package AtividadeListaGen;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int n1;
		int n2;
		int n3;
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("\nDigite o segundo número: ");
		n2 = ler.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		n3 = ler.nextInt();
		
		if (n1<=n2 && n2<=n3)
		{
			System.out.println("\\nOrdem crescente "+n1+ " , " +n2+" , "+n3);
					
		}
		else if (n1<=n3 && n3<=n2)
		{
			System.out.println("\\nOrdem crescente "+n1+ " , " +n3+" , "+n2);
		}
		else if (n2<=n1 && n1<=n3)
		{
			System.out.println("\\nOrdem crescente "+n2+ " , " +n1+" , "+n3);
		}
		else if (n2 <=n3 && n3<=n1)
		{
			System.out.println("\\nOrdem crescente "+n2+ " , " +n3+" , "+n1);
		}
		else if (n3<=n1 && n1<=n2)
		{
			System.out.println("\\nOrdem crescente "+n3+ " , " +n1+" , "+n3);
		}

	}

}
