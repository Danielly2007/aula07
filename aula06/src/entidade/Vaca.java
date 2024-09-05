package entidade;

public class Vaca extends Animal{

	public Vaca() {
		super();
	}
	
	public String emitirSom() {
		return super.emitirSom() + "MUuUuUuUuh";
	}

}
