package service;

import java.util.*;
import java.util.Map;

import metier.*;

public class CompteService {
	private Map<String,Compte> comptes = new HashMap<>();
	
	public void ajouterCompte(Compte compte) {
		if (comptes.containsKey(compte.getCode())) {
			System.out.println("le compte existe deja ");
		}else {
			comptes.put(compte.getCode(),compte);
			System.out.println("le compte ajouter avec succes");
		}
	}
	
	public Compte chercherCompte(String code) {
		return comptes.get(code);
	}
	
	public void verser(String code, double montant, String source ) {
		Compte c = chercherCompte(code);
		if(c != null) {
			c.verser(montant);
			c.ajouterOperation(new Versement(montant, source));
			System.out.println("verssement fait avec succes");
		}else {
			System.out.println("compte introuvable");
		}	
	}
	
	public void retirer(String code, double montant, String destination) {
		Compte c = chercherCompte(code);
		if(c != null) {
			c.retirer(montant);
		}else {
			System.out.println("compte introuvable");
		}
	}
	
	public void consulterSold(String code) {
		Compte c = chercherCompte(code);
		if(c != null) {
			System.out.println("Solde de compte "+ code +" : "+ c.getSolde());
		}else {
			System.out.println("compte introuvable");
		}
		
	}
	
	public void afficherOperations(String code) {
		Compte c = chercherCompte(code);
		if(c != null) {
			System.out.println("==== Historique des operations de "+ code +" ====");
			for(Operation op : c.getListeOperation()) {
				System.out.println(op);
			}
		}else {
			System.out.println("Compte introuvable");
		}
	}
	
	public void afficherTousLesComptes() {
		for(Compte c : comptes.values()) {
			c.afficherDetails();
			System.out.println();
		}
	}
	
	public static String geneCode() {
		Random RD = new Random();
		String code = "CPT-"+RD.nextInt(10000);
		return code;
	}
	

}
