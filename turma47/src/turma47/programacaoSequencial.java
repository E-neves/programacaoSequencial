package turma47;

import java.util.Scanner;

public class programacaoSequencial {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, pes1, pes2, pes3, soma, medPon; 
		
		System.out.println("Insira a 1°nota: ");
		nota1 = leia.nextInt();
		System.out.println("Insira a 2°nota: ");
		nota2 = leia.nextInt();
		System.out.println("Insira a 3°nota: ");
		nota3 = leia.nextInt();
		
		pes1 = nota1 * 2;
		pes2 = nota2 * 3;
		pes3 = nota3 * 5;
		
		soma = pes1+pes2+pes3;
		medPon = soma/10;
		
		System.out.println("O resultado da media poderada é de " + medPon);
		
				
		

	}

}
