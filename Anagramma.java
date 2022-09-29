import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagramma {
    public static void main(String[] args) {
        
        String parola;
        String parolaConfronto;

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci una parola per verificare se è un'anagramma:  ");
        parola = scan.nextLine().toLowerCase();

        System.out.print("Inserisci la parola da confrontare:  ");
        parolaConfronto = scan.nextLine().toLowerCase();
        scan.close();

        if (parola.length() == parolaConfronto.length()) {

            char[] charParola = parola.toCharArray(); 
            char[] charParolaConfronto = parolaConfronto.toCharArray();

            Arrays.sort(charParola);
            Arrays.sort(charParolaConfronto);

            System.out.println(charParolaConfronto);
            System.out.println(charParola);

            if (Arrays.equals(charParola ,charParolaConfronto)) {

                System.out.println("Le parole inserite sono un'anagramma");

            } else {

                System.out.println("Le parole non sono un'anagramma");
            }

        }
    }
}
