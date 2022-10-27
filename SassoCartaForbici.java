import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SassoCartaForbici {
    public static void main(String[] args) {
        
        //HOME
        benvenuto();

        //METODI
        Scanner scan = new Scanner(System.in);

        //ATTRIBUTI
        boolean decisione = true;
        boolean menuPrincipale = true;
        String tuaMossa;
        String sceltaPc;
        String giocatore1;
        String giocatore2;
        int pareggio = 0;
        int computer = 0;
        int giocatore = 0;
        int menu;
        int pareggioOnline = 0;
        int vittoriaGiocatore1 = 0;
        int vittoriaGiocatore2 = 0;
        

        while(menuPrincipale) {

            System.out.println("Scrivi 1 per scegliere di giocare in modalità single-player:  ");
            System.out.println("Scrivi 2 per scegliere di giocare in modalità CO-OP:  ");
            System.out.println("Scrivi 3 per visualizzare i punteggi in single-player:  ");
            System.out.println("Scrivi 4 per visualizzare i punteggi in CO-OP:  ");
            System.out.print("Aspetto la tua modalità di gioco:  ");
            int modalitàGioco = scan.nextInt();
    
            //CONTROLLO SCELTA UTENTE
            if (modalitàGioco == 5) {
    
                System.out.println("Scegli la modalità di gioco 1 e la modalità di gioco 4:  ");
            } 
    
    
            while(decisione) {
    
                //MENU PRINCIPALE
                switch (modalitàGioco) {
                    case 1:
        
                        System.out.print("Fai la tua mossa: ");
                        tuaMossa = scan.next();
        
                        System.out.println("\n");

                        sceltaPc = randomStringFromArr();
                        System.out.println("Ecco la mia mossa:  " + sceltaPc);
        
                        System.out.println("\n");
        
                        if(tuaMossa.equals(sceltaPc)) {
        
                            pareggio =+ 1;
                            System.out.println("\nAbbiamo pareggiato...");
        
                        } else if ((tuaMossa.equals("sasso") && sceltaPc.equals("foribci" )) || (tuaMossa.equals("forbici") && sceltaPc.equals("carta")) || (tuaMossa.equals("carta") && sceltaPc.equals("sasso"))) {
        
                            System.out.println("Complimenti hai vinto...");
                            giocatore =+ 1;
        
                        } else {
        
                            System.out.println("Mi dispiace, hai perso...");
                            computer =+ 1;
                        }
        
                        System.out.println("\n\nClicca 0 per ritonare al menu principale:  ");
                        System.out.println("Oppure clicca un altro numero per continuare:  ");
                        menu = scan.nextInt();
        
                        System.out.println("\n");


                        if (menu == 0) {
        
                            decisione = false;
                            System.out.println();
                            System.out.println();
                            System.out.println();
                        }


                    case 2:
                        
                        System.out.print("E il turno del giocatore 1:  ");
                        giocatore1 = scan.next();

                        System.out.println("\n\n");

                        System.out.print("E il turno del giocatore 2:  ");
                        giocatore2 = scan.next();

                        if(giocatore1.equals(giocatore2)) {
        
                            pareggioOnline =+ 1;
                            System.out.println("\nAbbiamo pareggiato...");
        
                        } else if ((giocatore1.equals("sasso") && giocatore2.equals("foribci" )) || (giocatore1.equals("forbici") && giocatore2.equals("carta")) || (giocatore1.equals("carta") && giocatore2.equals("sasso"))) {
        
                            System.out.println("Giocatore 2, ha perso...");
                            vittoriaGiocatore1 =+ 1;
        
                        } else {

                            System.out.println("Giocatore 1, ha perso...");
                            vittoriaGiocatore2 =+ 1;
                        }

                        System.out.println("\n\nClicca 0 per ritonare al menu principale:  ");
                        System.out.println("\n\nClicca 1 per ritonare al menu principale:  ");
                        menu = scan.nextInt();
        
                        if (menu == 0) {
        
                            decisione = false;
                            System.out.println();
                            System.out.println();
                            System.out.println();
                        }
                    
                    case 3: 
                        System.out.println();
                        System.out.println();
                        System.out.println("Il resoconto dei tuoi punteggi single-player:  ");
                        System.out.println("Hai totalizzato " + pareggio + " pareggi in single-player");
                        System.out.println("Hai totalizzato " + computer + " vittorie in single-player");
                        System.out.println("Hai totalizzato " + giocatore + " sconfitte in single-player");

                        System.out.println("\n\nClicca 0 per ritonare al menu principale:  ");
                        menu = scan.nextInt();
        
                        if (menu == 0) {
        
                            decisione = false;
                            System.out.println();
                            System.out.println();
                            System.out.println();
                        }
                    
                    case 4:
                        
                        System.out.println();
                        System.out.println();
                        System.out.println("Il resoconto dei tuoi punteggi CO-OP:  ");
                        System.out.println("Hai totalizzato " + pareggio + " pareggi in CO-OP");
                        System.out.println("Hai totalizzato " + computer + " vittorie in CO-OP");
                        System.out.println("Hai totalizzato " + giocatore + " sconfitte in CO-OP");

                        System.out.println("\n\nClicca 0 per ritonare al menu principale:  ");
                        menu = scan.nextInt();
        
                        if (menu == 0) {
        
                            decisione = false;
                            System.out.println();
                            System.out.println();
                            System.out.println();
                        }
                }

                scan.close();
            }
        }
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
