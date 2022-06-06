public class Loops {
    public static void main(String[] args) {
        String name = "John Doe";

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        for (int i = 0, j = 9; i < name.length() - 2; i++, j--) {
            System.out.println(name.charAt(j - 4));
        }

        int x = 0;  // we need an external iterator...
        do {
            System.out.println(name.charAt(x++));
        } while (x < name.length());

        int z = 0;
        while (z < name.length()){
            System.out.println(name.charAt(z++));
        }

        // linkedn example
        for (int i=0; i<10; i=i++){
            i+=1;
            System.out.println("Hello World!");
        }

        // linkedin question...
        String message = "Hello wold!";
        String newMessage = message.substring(6, 11)
                + message.substring(6);
        System.out.println(newMessage);

        int a = 1;
        a = a++;
        a = a + 1;
        System.out.println(a);


        // Nested for loops
        String something = "Korshad";


        for (int i = 0; i < something.length(); i++) {

            for (int j = 0; j < something.length(); j++) {
                System.out.println(i); // 3
                System.out.println(j); // 2
            }

        }

    }


}
