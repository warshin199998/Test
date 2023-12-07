package business;

import java.io.*;
import java.util.LinkedList;
import java.util.Observer;

import fabrikMethode.ConcreteCreatorCsv;
import fabrikMethode.ConcreteCreatorTxt;
import fabrikMethode.Creator;
import fabrikMethode.Product;
import ownUtil.MyObservable;
import ownUtil.MyObserver;

public class BuergeraemterModel implements MyObservable{
 	
	LinkedList<MyObserver> liste = new LinkedList<MyObserver>();
	
	public static BuergeraemterModel instanz=null;
	
	public static BuergeraemterModel getInstanz() {
		if(instanz == null) {
			instanz = new BuergeraemterModel();
		}
		return instanz;
	}
	
	
	private BuergeraemterModel () {
		
	}
	
	private Buergeramt buergeramt;

	public Buergeramt getBuergeramt() {
		return this.buergeramt;
	}
	
	public void setBuergeramt(Buergeramt buergeramt) {
		this.buergeramt = buergeramt;
		notifyObserver();
	}
 		
	public void schreibeBuergeraemterInCsvDatei()
	    throws IOException{
		Creator creator =new ConcreteCreatorCsv();
		Product writer = creator.factoryMethod();
		writer.fuegeInDateiHinzu(buergeramt);
		writer.schliessDatei();

 	}
	public void schreibeBuergeraemterInTxtDatei()throws IOException{
		Creator creator =new ConcreteCreatorTxt();
		Product writer = creator.factoryMethod();
		writer.fuegeInDateiHinzu(buergeramt);
		writer.schliessDatei();
	}



	public void addObserver(MyObserver obs) {
		liste.add(obs);
		
	}



	public void removeObserver(MyObserver obs) {
		liste.remove(obs);
		
	}


	@Override
	public void notifyObserver() {
		for(MyObserver o:liste) {
			o.update();
		}
		
	}


	

}

