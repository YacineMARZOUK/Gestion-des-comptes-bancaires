package metier;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Operation {
	protected UUID numero ;
	protected LocalDate date;
	protected double montant;
	
	
	public Operation(double montant) {
		this.numero = UUID.randomUUID();
		this.date = LocalDate.now();
		this.montant=montant;
	}
	
	public UUID getNumero() {
		return this.numero;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public double getMontant() {
        return montant;
    }
	
	public abstract String toString();

}
