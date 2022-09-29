public class Fibonacci {
    public static void main(String[] args) {
        
        int fibonacci = 10;
        int n1 = 0;
        int n2 = 1;
        int totale;

        for (int i = 1; i<fibonacci; i++) {

            totale = n1 + n2;
            System.out.println( "" + totale);
            n1 = n2;
            n2 = totale;
        }
    }
}
