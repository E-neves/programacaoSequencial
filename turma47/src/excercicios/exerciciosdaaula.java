package excercicios;

import java.util.Scanner;

public class exerciciosdaaula {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		int idade; 
		
		System.out.println("Quantos anos você tem:  ");
		idade = leia.nextInt();
		
		if( idade>= 10 && idade<= 14 ) {
			System.out.println("Você está na catergoria: INFANTIL");
		}
		else if( idade>= 15 && idade<= 17 ) {
			System.out.println("Você está na catergoria: JUVENIL");
		}
		else if( idade>= 18 && idade<= 25 ) {
			System.out.println("Você está na catergoria: ADULTO");
		}
		
		else {
		System.out.println("IDADE INVALIDA - DIGITE UMA IDADE ENTRE 10 E 25 ANOS.");
		}
		
			}

	}

