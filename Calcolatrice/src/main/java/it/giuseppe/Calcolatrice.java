package it.giuseppe;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Calcolatrice {
	 private Operazione operazione;
	 
	 Scanner input = new Scanner(System.in);
	 
	    public Calcolatrice(Operazione operazione) {
	        this.operazione = operazione;
	    }
	    
		
		public double Calcolo () {
			
			double valore1 = operazione.getValore1();
			double valore2 = operazione.getValore2();
			String scelta = operazione.getScelta();
			double risultato = 0;
			
			if(scelta.equals("1")) {
				
				risultato = valore1 + valore2;
			}
			if(scelta.equals("2")) {
			
			  risultato = valore1 - valore2;
		  }
		  
		  if(scelta.equals("3")) {
				
			  risultato = valore1 * valore2;
		  }
		  
		  if(scelta.equals("4")) {
				
			  risultato = valore1 / valore2;
		  }
			return risultato;
		}


		public void toString(double calcolo) {
			System.out.println("Operazione effettuata con successo");
			
		}
	    
		
}
