package ProjetoJavaiViajar;

public class SugestoesViagem {
}
	import java.util.Scanner;

	public class SugestoesViagem {

		public void SugerirViagem() {
		
		Scanner leia = new Scanner(System.in);

		String pergunta1 = " ";
		String pergunta2 = " ";
		String pergunta3 = " ";
		String pergunta4 = " ";
		char simOuNao;
		
		
		

		System.out.println();
		System.out.println("Agora nosso site irá fazer algumas perguntas para determinar o melhor destino de viagem!");
		System.out.println();
		System.out.println("Você vai viajar em :" + 
		"\nA - Família;" + 
		"\nB - Casal;" + 
		"\nC - Sozinha;" +
		"\nDigite a letra correspondente:");
		pergunta1 = leia.next();

		System.out.println("\nVocê procura um lugar para :" + 
		"\nA - Relaxar;" + 
		"\nB - Curtir;" + 
		"\nC - Trabalho" +
		"\nDigite a letra correspondente:");
		pergunta2 = leia.next();

		System.out.println("\nVocê prefere :" + 
		"\nA - Calor;" + 
		"\nB - Frio;" + 
		"\nC - Clima Ameno" +
		"\nDigite a letra correspondente:");
		pergunta3 = leia.next();

		System.out.println("\nVocê busca por :" + 
		"\nA - Uma boa balada;" + 
		"\nB - Um bom roteiro gastronômico;" +
		"\nC - Uma rotina cheia de aventuras" + 
		"\nDigite a letra correspondente:");
		pergunta4 = leia.next();


		String conjunto = (pergunta1 + pergunta2 + pergunta3 + pergunta4);

		//System.out.println(conjunto);

		System.out.println();
		switch (conjunto){
			case"BABB":
				System.out.println("Com base nas suas respostas" +
					" o destino indicado é: Monte Verde - MG");
		break;
			case"CBAA":
				System.out.println("Com base nas suas respostas" +
					 " os destinos indicados são: Porto Seguro - BA" +
					 " e Praia de Copacabana - RJ");
		break;
			case"AAAC":
				System.out.println("Com base nas suas respostas" +
					" os destinos indicados são: Praia do Espelho - Trancoso - BA" +
					" e Praia do Forte - Mata de São João - BA");
		break;
			case"BBCB":
				System.out.println("Com base nas suas respostas" +
					" o destino indicado é: São Roque - SP");
		break;
			case"ABCC":
				System.out.println("Com base nas suas respostas" +
					" os destinos indicados são: Brotas - SP" +
					" e Olímpia - SP"	);
		break;
			case"CABC":
				System.out.println("Com base nas suas respostas" +
					" os destinos indicados são: Pico dos Três Estados - MG" +
					" e Pico das agulhas Negras - RJ");	
		break;
			case"ACAC":
				System.out.println("Com base nas suas respostas" +
					" o destino indicado é: Águas de São Pedro - SP");	
		break;
			case"BAAC":
				System.out.println("Com base nas suas respostas" +
					" o destino indicado é: Porto de Galinhas - PE");	
		break;
			case"CCAB":
				System.out.println("Com base nas suas respostas" +
					" o destino indicado é: Ouro Preto - MG");	
		break;
			case"AABC":
				System.out.println("Com base nas suas respostas" +
					" os destinos indicados são: Serra Negra - SP" +
					" e Curitiba - PR");	
		break;
		default: System.out.println("Com base nas suas respostas" +
				" o destino indicado é: Cornélio Procópio - PR");
		}
		System.out.println();
		System.out.println("Você gostaria de ver as opções de estadia? Digite 's' ou 'n': ");
		simOuNao = leia.next().charAt(0);
		
		while(simOuNao != 's' && simOuNao != 'n') {
			System.out.println("Valor digitado inválido! Por favor digite 's' para");
			System.out.println("prosseguir ou 'n' para finalizar o programa...");	
			simOuNao = leia.next().charAt(0);
		}
		if(simOuNao == 's') {
			System.out.println("Então vamos lá!");
		}
		else if(simOuNao == 'n') {
			System.out.println("Operação encerrada!");
			System.exit(0);
		}
		leia.close();
	}
	}
