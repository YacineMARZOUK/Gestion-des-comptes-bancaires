package metier;

import java.util.ArrayList;
import java.util.List;




public abstract class Compte {
	protected String code;
	protected double solde;
	protected List<Operation> listOperation = new ArrayList<>();
	
	
	public Compte (String code, double solde) {
		this.code= code;
		this.solde= solde;
	}
	
	public abstract void retirer(double mantant);
	public abstract double calculerInteret();
	public abstract void afficherDetails();
	
	
	public void verser(double montant) {
		this.solde += montant;
	}
	
	public void ajouterOperation(Operation op) {
		listOperation.add(op);
	}
	
	
	public String getCode() {
		return this.code;
	}
	
	public double getSolde() {
		return this.solde;
	}
	
	public List<Operation> getListeOperation(){
		return this.listOperation;
	}

}
