public class SommaEMediaArray {
    
    public static void main(String[] args) {
        
        int [] array = {12, 5, 7, 20};
        int somma = 0;

        for (int i : array) {

            somma = (somma + i) / array.length;
        }

        System.out.println(somma);
    }
}
