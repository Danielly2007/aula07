package principal;

import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro C = new Cachorro();
		System.out.print(C.emitirSom()) ;
			
		
		Gato G = new Gato();
		System.out.print(G.emitirSom()) ;
		
		Vaca V = new Vaca();
		System.out.print(V.emitirSom()) ;
			
		}
	}


