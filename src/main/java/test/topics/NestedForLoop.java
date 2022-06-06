public class NestedForLoop {

    public static void main(String[] args) {

        String ankk = "hi";

        String another = new String();

        System.out.println(ankk instanceof String);
        int a = 0;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
