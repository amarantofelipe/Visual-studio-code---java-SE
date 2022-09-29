public class NumeriPattern {
    public static void main(String[] args) {

        int pattern = 45;

        for (int i = 1; i < pattern; i++) {

            for (int j = 1; j < i + 1; j++) {

                System.out.print(j);
            }

            System.out.println();
        }

        for (int i = pattern; i>=1; i--) {

            for (int y=i; y>0; y--) {

                System.out.print(y);
            }

            System.out.println();
        }
    }
}
