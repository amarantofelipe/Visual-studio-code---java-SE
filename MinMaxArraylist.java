import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*HAI UN ARRAYLIST DI INTERI E BISOGNA FARE UN ORDINAMENTO CRESCENTE DELL'ARRAY E SUCCESSIVAMENTE BISOGNA RICERCARE
 * IL MINIMO E IL MASSIMO DELL'ARRAYLIST E STAMPARLA A SCHERMO
*/


public class MinMaxArraylist {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<Integer>();
        array.add(12);
        array.add(8);
        array.add(9);
        array.add(20);

       int numeri = array.size();
       
       System.out.println("I numeri dell'arraylist sono : ");

       //STAMPO L'INTERO ARRAYLIST E MOSTRARLO A SCHERMO
       for (int i = 0; i<numeri; i++) {

        System.out.println(array.get(i) + "");
    
       }

       //OPERAZIONE DI ORDINAMENTO IN MODO CRESCENTE E CICLO PER STAMPARLI A SCHERMO
       System.out.println("\n\nI numeri dell'arrylist ordinati in modo crescente:  ");
       Collections.sort(array);

       for (int i = 0; i<numeri; i++) {

        System.out.println(array.get(i) + "");

       }


       //OPERAZIONE DI MINIMO E MASSIMO E STAMPARLO A SCHERMO
      int min = array.get(0);
      int max = array.get(numeri - 1);

      System.out.println("\nIl numero minimo all'interno dell'Arraylist è:  " + min);
      System.out.println("\nIl numero massimo all'interno dell'Arraylist è:  " + max + "\n");
    }
}