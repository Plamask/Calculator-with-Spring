package it.giuseppe;
import java.util.Scanner;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Operazione {

	private String scelta;
	private double valore1;
	private double valore2;
	
	
	public Operazione (double valore1, double valore2) {
		
		
		this.valore1 = valore1;
		this.valore2 = valore2;
		
	}
	Scanner input = new Scanner(System.in);
	Calcolatrice calcolatrice = new Calcolatrice(null);
	
	public void getOperazione() {
	   
		
		
		System.out.println("Inserisci primo valore");
		this.valore1 = Double.parseDouble(input.nextLine());
		System.out.println("Inserisci primo valore");
		this.valore2 = Double.parseDouble(input.nextLine());
		
		System.out.println("Premi 1 per addizione, 2 per sottrazione, 3 per moltiplicazione, 4 per divisione");
		this.scelta = input.nextLine();
		input.close();
		
		
		
		  
	}
}
