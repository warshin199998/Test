package fabrikMethode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Buergeramt;

public class ConcreteTxtProduct  extends Product {
	BufferedWriter ausgabe;

	public ConcreteTxtProduct() throws IOException {
		ausgabe =new BufferedWriter(new FileWriter("Buergeraemter.txt",true));
		
	}

	@Override
	public void fuegeInDateiHinzu(Buergeramt buergeramt) throws IOException {
		ausgabe.write("Daten des buergeramts\n ");
		ausgabe.write("Name des buergeramts\t"+ buergeramt.getName() );
		ausgabe.write("\n÷ffnungszeit des buergeramts:\t "+ buergeramt.getGeoeffnetVon() + " "+ buergeramt.getGeoeffnetBis());
		ausgabe.write("\nStraﬂe und Hausnummer des buergeramts:\t"+buergeramt.getStrasseHNr());
		ausgabe.write("\nDienstleistungen des buergeramts:\t"+ buergeramt.getDienstleistungenAlsString('v'));

	}

	@Override
	public void schliessDatei() throws IOException {
		
		ausgabe.close();
	}

}

