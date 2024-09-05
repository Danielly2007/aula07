package entidade;

public class Gato extends Animal {
	
	public Gato() {
		super();
	}

	public String emitirSom() {
		return super.emitirSom() + "MIAUH";
	}

}
