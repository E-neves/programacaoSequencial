package aulaDeMetodo;

public class metodo {

	String nome;
	String enderešo;
	int idade;
	
	
	
	Paciente pac1 = new Paciente();
	Paciente pac2 = new Paciente();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	void intenacao(){
		System.out.println("Internado...");
	}
	
	void ala() {
		System.out.println("ALA: Infermaria...");
	}
	
	void altaHospital() {
		System.out.println("Alta Hospitalar...");
	}
	
	
	
}
