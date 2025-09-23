package metier;

public class CompteCourant extends Compte {
	
	private double decouvert;
	
	public CompteCourant(String code, double solde, double decouvert) {
		super(code, solde);
		this.decouvert=decouvert;
	}
	
	@Override
	public void retirer(double montant) {
		if(montant<=0) {
			System.out.println("montant invalide");
			return;
		}
		
		if(solde  >= montant ) {
			solde -= montant;
			ajouterOperation(new Retrait(montant,"retrait depuis compte courant "));
			System.out.println("Retrait fait avec succes");
		}else {
			System.out.println("le montant depasse le decouvert autorise");
		}
	}
	
	
	@Override
	public double calculerInteret() {
		return 0;
	}
	
	@Override
	public void afficherDetails() {
		System.out.println("=== compte courant ===");
		System.out.println("Code     :" + code);
		System.out.println("Solde     :" + solde);
		System.out.println("Decouvert     :" + decouvert);
		System.out.println("operations     :" + listOperation.size());
		
	}

}
