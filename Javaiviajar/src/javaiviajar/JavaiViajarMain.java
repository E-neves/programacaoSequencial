package javaiviajar;

import java.util.Scanner;  

public class JavaiViajarMain {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner entrada = new Scanner(System.in);
		
		String loginCriado;
		String senhaCriada;
		String login;
		String senha;
		char possuiContaOuNao;
		
		Thread.sleep(500);
		System.out.println("====================================================");
		Thread.sleep(500);
        System.out.println("=              Não sabe para onde ir?              =");
        Thread.sleep(500);
		System.out.println("=              JAVAi Viajar te ajuda!              =");
		Thread.sleep(500);
		System.out.println("=                                                  =");
		Thread.sleep(500);
		System.out.println("=                                                  =");
		Thread.sleep(500);
		System.out.println("=  Olá, bem vindo a JAVAi Viajar, o melhor e mais  =");
		Thread.sleep(500);
		System.out.println("=  econômico site de viagens!                      =");
		Thread.sleep(500);
		System.out.println("=                                                  =");
		Thread.sleep(500);
		System.out.println("=  Você já possui uma conta?                       =");
		Thread.sleep(500);
		System.out.println("=                                                  =");
		Thread.sleep(500);
		System.out.println("=  Se sim, por favor digite 's' senão  digite 'n'  =");
		Thread.sleep(500);
		System.out.println("=  para criar sua conta.                           =");
		Thread.sleep(500);
		System.out.println("====================================================");
		
		possuiContaOuNao = entrada.next().charAt(0);
		
		while(possuiContaOuNao != 's' && possuiContaOuNao != 'n') {
			System.out.println("Valor digitado inválido! Por favor digite 's' se");
			System.out.println("possuir uma conta ou 'n' caso não possua...");	
			possuiContaOuNao = entrada.next().charAt(0);
		}
		
		if(possuiContaOuNao == 's') {
			System.out.println("==================");
			System.out.println("=     SING IN    =");
			System.out.println("==================");
			System.out.println();
			System.out.println("Digite seu login: ");
			login = entrada.next();
			System.out.println("Digite sua senha: ");
			senha = entrada.next();
			
			while(!login.equals("thiago.tomita2@gmail.com") || !senha.equals("123")) {
				System.out.println("Login ou senha inválido! Tente novamente...");
				System.out.println();
				System.out.println("Digite seu login: ");
				login = entrada.next();
				System.out.println("Digite sua senha: ");
				senha = entrada.next();
				
			}
			if (login.equals("thiago.tomita2@gmail.com") && senha.equals("123")) {
				System.out.println("Bem vindo Thiago Tomita!");
			}
			
		}
		else if(possuiContaOuNao == 'n') {
			System.out.println("==================");
			System.out.println("=     SING UP    =");
			System.out.println("==================");
			System.out.println();
			System.out.println("Crie seu login: ");
			loginCriado = entrada.next();
			System.out.println("Crie sua senha: ");
			senhaCriada = entrada.next();
			System.out.println("Bem vindo Augustin Carrara!");
		}
		entrada.close();
	}
}
