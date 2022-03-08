package AulasBLOCO1;

import java.util.Scanner;

public class lacosDeRepticao {
	
		
	public static void main(String[] args) throws InterruptedException {
		
		Scanner leia = new Scanner(System.in);
		
		int x = 0, max=100; 
		
		System.out.println("Coloque um numero:  ");
		x = leia.nextInt();
		
				
		while (x<=1000) {
			x = x*3; 
			System.out.println("FAZENDO A MULTIPLICAÇÃO  " + x);
			Thread.sleep(500);
			
		}
}
}

		
		
	
		
	