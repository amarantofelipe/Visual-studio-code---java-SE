import java.util.Scanner;

public class TabellinaInput {
    public static void main(String[] args) {
        
        int numero;
        int tabellina;

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero e scoprire la tabellina:  ");
        numero = scan.nextInt();
        scan.close();

        for (int i = 0; i<=10; i++) {

            tabellina = numero * i;
            System.out.println("Il risultato della tabellina fino al 10 è:  " + tabellina);
        }
    }
}
