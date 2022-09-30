import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SassoCartaForbici {
    public static void main(String[] args) {
        
        //HOME
        benvenuto();

        //METODI
        Scanner scan = new Scanner(System.in);

        //ATTRIBUTI
        String tuaMossa;
        boolean decisione = true;
        //int pareggio = 0;
        String sceltaPc;

        System.out.println("Scrivi 1 per scegliere di giocare in modalità single-player:  ");
        System.out.println("Scrivi 2 per scegliere di giocare in modalità CO-OP:  ");
        System.out.print("Aspetto la tua modalità di gioco:  ");
        int modalitàGioco = scan.nextInt();
        


        //CONTROLLO SCELTA UTENTE
        if (modalitàGioco == 3) {

            System.out.println("Scegli la modalità di gioco 1 e la modalità di gioco 2:  ");
        } 


       while(decisione) {

        //MENU PRINCIPALE
        switch (modalitàGioco) {
            case 1:

            System.out.print("Fai la tua mossa: ");
            tuaMossa = scan.next();

            sceltaPc = randomStringFromArr();
            System.out.println("Ecco la mia mossa:  " + sceltaPc);

            

            if(tuaMossa.equals(sceltaPc)) {

                //pareggio =+ 1;
                System.out.println("\nAbbiamo pareggiato...");

            } else if ((tuaMossa.equals("sasso") && sceltaPc.equals("foribci" )) || (tuaMossa.equals("forbici") && sceltaPc.equals("carta")) || (tuaMossa.equals("carta") && sceltaPc.equals("sasso"))) {

                System.out.println("Brav e vinciut");
            } else {

                System.out.println("Brav o strunz e perz");
            }

            default:
                break;
        }

       }

       scan.close();
    }

    public static String randomStringFromArr() {
        String[] mosse = {"sasso", "carta", "forbici"};
        int randIdx = ThreadLocalRandom.current().nextInt(mosse.length);
        String randomElem = mosse[randIdx];
        return randomElem;
    }


    static public void benvenuto() {
        
        System.out.println("""
        
        



            /$$$$$$   /$$$$$$   /$$$$$$   /$$$$$$   /$$$$$$            /$$$$$$   /$$$$$$  /$$$$$$$  /$$$$$$$$ /$$$$$$ 
            /$$__  $$ /$$__  $$ /$$__  $$ /$$__  $$ /$$__  $$          /$$__  $$ /$$__  $$| $$__  $$|__  $$__//$$__  $$
           | $$  \\__/| $$  \\ $$| $$  \\__/| $$  \\__/| $$  \\ $$         | $$  \\__/| $$  \\ $$| $$  \\ $$   | $$  | $$  \\ $$
           |  $$$$$$ | $$$$$$$$|  $$$$$$ |  $$$$$$ | $$  | $$         | $$      | $$$$$$$$| $$$$$$$/   | $$  | $$$$$$$$
            \\____  $$| $$__  $$ \\____  $$ \\____  $$| $$  | $$         | $$      | $$__  $$| $$__  $$   | $$  | $$__  $$
            /$$  \\ $$| $$  | $$ /$$  \\ $$ /$$  \\ $$| $$  | $$         | $$    $$| $$  | $$| $$  \\ $$   | $$  | $$  | $$
           |  $$$$$$/| $$  | $$|  $$$$$$/|  $$$$$$/|  $$$$$$//$$      |  $$$$$$/| $$  | $$| $$  | $$   | $$  | $$  | $$
            \\______/ |__/  |__/ \\______/  \\______/  \\______/| $/       \\______/ |__/  |__/|__/  |__/   |__/  |__/  |__/
                                                            |_/                                                        
                                                                                                                       
                                                                                                                       
            /$$$$$$$$       /$$$$$$$$ /$$$$$$  /$$$$$$$  /$$$$$$$  /$$$$$$  /$$$$$$  /$$$$$$$$                         
           | $$_____/      | $$_____//$$__  $$| $$__  $$| $$__  $$|_  $$_/ /$$__  $$| $$_____/                         
           | $$            | $$     | $$  \\ $$| $$  \\ $$| $$  \\ $$  | $$  | $$  \\__/| $$                               
           | $$$$$         | $$$$$  | $$  | $$| $$$$$$$/| $$$$$$$   | $$  | $$      | $$$$$                            
           | $$__/         | $$__/  | $$  | $$| $$__  $$| $$__  $$  | $$  | $$      | $$__/                            
           | $$            | $$     | $$  | $$| $$  \\ $$| $$  \\ $$  | $$  | $$    $$| $$                               
           | $$$$$$$$      | $$     |  $$$$$$/| $$  | $$| $$$$$$$/ /$$$$$$|  $$$$$$/| $$$$$$$$                         
           |________/      |__/      \\______/ |__/  |__/|_______/ |______/ \\______/ |________/                         
                                                                                                                       
                                                                                                                       
                                                                                                                       
           
          
          
          
          
          
                      """);
    }
}
