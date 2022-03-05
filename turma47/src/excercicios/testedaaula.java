package excercicios;

import java.util.Scanner;

public class testedaaula {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in); 
		
		int n1,n2,n3; 
		
		System.out.println("Digite 3 numeros: ");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("a ordem crescente é:  " + n1 + "|" + n2 + "|" + n3);
		}
		else if(n1< n3 && n3 < n2) {
			System.out.println("a ordem crescente é:  " + n1 + "|" + n3 + "|" + n2);
		}
		else if(n2< n1 && n1 < n3) {
			System.out.println("a ordem crescente é:  " + n2 + "|" + n1 + "|" + n3);
		}
		else if(n2< n3 && n3 < n1) {
			System.out.println("a ordem crescente é:  " + n2 + "|" + n3 + "|" + n1);
		}
		else if(n3< n1 && n1 < n2) {
			System.out.println("a ordem crescente é:  " + n3 + "|" + n1 + "|" + n2);
		}
		else  {
			System.out.println("a ordem crescente é:  " + n3 + "|" + n2+ "|" + n1);
		}
	}




	}


