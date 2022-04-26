package generation.metodo;

import javax.swing.Spring;

public class TesteMetodo {
	
	public static void main(String[] args) { 	
		
		
	Aluno a1 = new Aluno();
	Aluno a1 = new Aluno();	
		
	a1.nome = "Esmeralda";
	a1.idade = 22;
	a1.curso = "Bloco I - Java";
	a1.matricula = "RA3655";
	
	System.out.println(a1.nome);
	System.out.println(a1.idade);
	System.out.println(a1.curso);
	System.out.println(a1.matricula);
	
	
	a1.assistirAula();
	a1.estudar();
	a1.fazerProva();
	System.out.println();
	
	a2.nome = "André";
	a2.idade = 25;
	a2.curso = "Bloco II - Spring";
	a2.matricula = "RA7894";
	
	System.out.println(a2.nome);
	System.out.println(a2.idade);
	System.out.println(a2.curso);
	System.out.println(a2.matricula);
	
	a2.assistirAula();
	a2.estudar();
	a2.fazerProva();
	
	}
}


