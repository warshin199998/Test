package fabrikMethode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Buergeramt;

public class ConcreteTxtProduct  extends Product {
	BufferedWriter austxt;

	public ConcreteTxtProduct() throws IOException {
		austxt =new BufferedWriter(new FileWriter("Buergeraemter.txt",true));
		
	}

	@Override
	public void fuegeInDateiHinzu(Buergeramt buergeramt) throws IOException {
		austxt.write("Daten des buergeramts\n ");
		austxt.write("Name des buergeramts\t"+ buergeramt.getName() );
		austxt.write("\nöffnungszeit des buergeramts:\t "+ buergeramt.getGeoeffnetVon() + " "+ buergeramt.getGeoeffnetBis());
		austxt.write("\nStraße und Hausnummer des buergeramts:\t"+buergeramt.getStrasseHNr());
		austxt.write("\nDienstleistungen des buergeramts:\t"+ buergeramt.getDienstleistungen());

	}

	@Override
	public void schliessDatei() throws IOException {
		// TODO Auto-generated method stub
		austxt.close();

	}

}
