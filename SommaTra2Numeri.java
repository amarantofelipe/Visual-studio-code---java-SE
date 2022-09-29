
public class SommaTra2Numeri {

	public static void main(String[] args) {

		int inizio = 5;
		int fine = 12;
		int somma = 0;
		/*
		 * int inizio = 12
		 * int fine = 5
		 * */
		
		
		if (inizio < fine) {
			
			for (int i = inizio + 1; i<=fine-1; i++) {
				
				somma = somma + i;
				
			}
			
		} else {
			
			for (int i = fine + 1; i<=inizio-1; i++) {
				
				somma = somma + i;
				
			}	
			
		}
		System.out.println("La somma dei numeri compresi tra 6 e 11 è:  " + somma);

	}

}