package fabrikMethode;

import java.io.IOException;

import business.Buergeramt;

public abstract class Product {
	public abstract void fuegeInDateiHinzu(Buergeramt buergeramt) throws IOException;
	public abstract void schliessDatei()throws IOException ;
}
