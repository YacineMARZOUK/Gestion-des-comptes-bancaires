package ui;

import metier.*;
import service.CompteService;

import java.util.Scanner;


public class BanqueUI {
	
	private CompteService service = new CompteService();
	private Scanner scanner = new Scanner(System.in);
	
	
	public void demarrer() {
		
		int choix;
		do {
			afficherMenu();
			choix = lireEntier("votre choix : ");
			switch(choix) {
				case 1 :
					creerUnCompte();
				    break;
				case 2 :
					effectuerVersement();
					break;
				case 3 :
					effectuerRetrait();
					break;
				case 4 :
					 consulterSolde();
	                 break;
				case 5 :
					afficherOperations();
                    break;
				case 6 :
					 service.afficherTousLesComptes();
	                    break;
				case 0 : 
					System.out.println("Merci d'avoire utiliser notre banque ");
					break;
				default:
					System.out.println("choix invalide");
					
			}
		}while(choix != 0);
	}
	
	 private void afficherMenu() {
	        System.out.println("\n======= MENU BANQUE =======");
	        System.out.println("1. Créer un compte");
	        System.out.println("2. Effectuer un versement");
	        System.out.println("3. Effectuer un retrait");
	        System.out.println("4. Consulter le solde");
	        System.out.println("5. Afficher les opérations");
	        System.out.println("6. Afficher tous les comptes");
	        System.out.println("0. Quitter");
	        System.out.println("============================");
	    }
	 
	 private void creerUnCompte() {
		 try {
			 System.out.println("Type de compte ? (1: Courant | 2: Epargne )");
			 int type = lireEntier("choix : ");
			 String code = CompteService.geneCode();
			 System.out.println(code);
			 double solde = lireDouble("Solde initial :");
			 
			 
			 if(solde<0) {
				 throw new IllegalArgumentException("Solde invalide il doit etre positif ");
			 }
			 
			 if(type==1) {
				 double decouvert = lireDouble("decouvert autorise : ");
				 service.ajouterCompte(new CompteCourant(code, solde, decouvert));
			 }else if(type==2) {
				 double taux = lireDouble("taux d'interet :");
				 service.ajouterCompte(new CompteEpargne(code, solde, taux));
			 }else {
				 System.out.println("Type de compte inconnu");
			 }
		 }catch(Exception e){
			 System.out.println("Erreur :" + e.getMessage());
		 }
	 }
	 
	 private void effectuerVersement() {
		 String code = lireTexte("Code de compte : ");
		 double montant = lireDouble("Montant : ");
		 String source = lireTexte("Source (ex: Salaire, Cotisation sociale");
		 service.verser(code, montant, code);
	 }
	 
	 private void effectuerRetrait() {
		 String code = lireTexte("Code de compte");
		 double montant = lireDouble("Montant : ");
		 String destination = lireTexte("Destination (ex: ATM, Virement)");
		 service.retirer(code, montant, destination);
	 }
	 
	 private void consulterSolde() {
		 String code = lireTexte("Code du compte : ");
		 service.consulterSold(code);
	 }
	 
	 private void afficherOperations() {
		 String code = lireTexte("Code du compte : ");
		 service.afficherOperations(code);
	 }
	 
	 private String lireTexte(String message) {
		 System.out.print(message);
		 return scanner.nextLine().trim();
	 }
	 
	 private int lireEntier(String message) {
		 System.out.print(message);
		 while(!scanner.hasNextInt()) {
			 System.out.print("Entrer un nombre valide : ");
			 scanner.next();
		 }
		 int val = scanner.nextInt();
		 scanner.nextLine();
		 return val ;
	 }
	 
	 private double lireDouble(String message) {
		 System.out.print(message);
		 while(!scanner.hasNextDouble()) {
			 System.out.print("Entrer le montant valide :");
			 scanner.next();
		 }
		 double val = scanner.nextInt();
		 scanner.nextLine();
		 return val;
	 }
	 
	 
	 
	 
	 
	 


}
