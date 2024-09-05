package entidade;

public class Cachorro extends Animal {
	
	public Cachorro() {
		super();
	}

	public String emitirSom() {
		return super.emitirSom() + "AUAU";
	}

}
