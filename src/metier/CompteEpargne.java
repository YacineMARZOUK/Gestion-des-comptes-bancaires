package metier;

public class CompteEpargne extends Compte {
	
	private double tauxInteret;
	
	public CompteEpargne(String code, double solde, double tauxInteret) {
		super(code, solde);
		this.tauxInteret=tauxInteret;
	}
	
	@Override
	public void retirer(double montant) {
		if(montant <= 0) {
			System.out.println("le montant est invalide");
			return;
			}
		
		if (solde >= montant) {
			solde -= montant;
			ajouterOperation(new Retrait(montant,"Retrait depuis epargne compte"));
			System.out.println("operation effectue avec succes");
		}else {
			System.out.println("le montant souhaite est plus que lepargne");
		}
	}
	
	@Override
	public double calculerInteret() {
        return solde * tauxInteret / 100;
    }
	
	public void afficherDetails() {
        System.out.println("===== Compte Épargne =====");
        System.out.println("Code         : " + code);
        System.out.println("Solde        : " + solde);
        System.out.println("Taux Intérêt : " + tauxInteret + "%");
        System.out.println("operations     :" + listOperation.size());
    }
	

}
