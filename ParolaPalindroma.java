import java.util.Scanner;

public class ParolaPalindroma {
    
    public static void main(String[] args) {
        
        System.out.print("Stringa: ");
        String parola;
        Scanner scan = new Scanner(System.in);
        parola = scan.nextLine();
        scan.close();
 
        // la utilizzo per il controllo con l'originale
        String inversa = "";
        
        // calcolo la lunghezza della stringa
        int lunghezza = parola.length();
         
        
        for (int i = lunghezza - 1; i >= 0; i--)
            // ritorna il carattere all'indice i
            inversa += parola.charAt(i);
         
        System.out.printf("La stringa %sè palindroma. \n", parola.equals(inversa) ? "" : "non ");
    }
}
