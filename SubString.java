public class SubString {
    public static void main(String[] args) {
        
        String stringa = "abcd";

        String strB = stringa.substring(1, 2).toUpperCase();
        String strD = stringa.substring(3, 4).toUpperCase();
        System.out.println("La prima lettera estratta è:  " + strB + "\nLa seconda lettera estratta è:  " + strD);
    }
}
