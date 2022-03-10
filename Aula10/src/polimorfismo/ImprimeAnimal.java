package polimorfismo;

public class ImprimeAnimal {

public static void main(String[] args) {
		
		testeanim t = new testeanim();
		
		t.fazerAnimalComer(new tigre());
		t.fazerAnimalComer(new Cachorro());
	}

}
