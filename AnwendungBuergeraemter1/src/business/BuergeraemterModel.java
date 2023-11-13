package business;

import java.io.*;

public class BuergeraemterModel {
 		
	private Buergeramt buergeramt;

	public Buergeramt getBuergeramt() {
		return this.buergeramt;
	}
	
	public void setBuergeramt(Buergeramt buergeramt) {
		this.buergeramt = buergeramt;
	}
 		
	public void schreibeBuergeraemterInCsvDatei()
	    throws IOException{
	    BufferedWriter aus = new BufferedWriter(new FileWriter("Buergeraemter.csv", true));
	   		aus.write(this.buergeramt.gibBuergeramtZurueck(';'));
	    aus.close();
 	}

}