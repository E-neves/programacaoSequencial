package AulasBLOCO1;

import java.util.Scanner;

public class pontuacao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int [5];
		int x;
		
		
		for (x=0; x<5; x++);
		System.out.println("Coloque a pontuação:  ");
		vetor[x] = leia.nextInt();
		
		System.out.println("VALOR POSIÇÃO " + x+1 + ":" + vetor[x]);
		
		leia.close();
		
		
		
	}
	
		

}
