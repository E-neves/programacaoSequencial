package AulasBLOCO1;

import java.util.Scanner;

public class pontuacao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int v = 5;
		int vetor[] = new int [v];
		int x;
		
		vetor = new int [0];
		
		for (x=0; x<5; x++);
		System.out.println("Coloque a pontuação:  ");
		vetor[x] = leia.nextInt();
		
		System.out.println("VALOR POSIÇÃO " + x+1 + ":" + vetor[x]);
		
		leia.close();
		
		
		
	}
	
		

}
