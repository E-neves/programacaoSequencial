package aprendendointerfaces;

public class Aprendendo1 implements Aprendendo {

	@Override
	public void somAnimal() {
		System.out.println("O som do cachorro: AU AU");		
	}

	@Override
	public void dormir() {
		System.out.println("Cachorro dormindo...");		
	}

}
