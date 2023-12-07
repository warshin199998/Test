package fabrikMethode;

import java.io.IOException;

public class ConcreteCreatorTxt extends Creator {
	@Override
	public Product factoryMethod() throws IOException {
		return new ConcreteTxtProduct()  ;
		
	}



}


