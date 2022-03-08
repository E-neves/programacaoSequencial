package AulasBLOCO1;

import java.util.Scanner;

public class tabuada {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, tab, res;

		System.out.println("Entre com o valor da tabuada:  ");
		tab = leia.nextInt();
		
		for (x=1; x<=10; x++); {
			
		res = x * tab; 
			System.out.println(+ x + " X " + tab+ " = " + res);
			
		}
		
	}
}


		
		
