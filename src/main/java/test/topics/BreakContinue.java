package test.topics;
/*  for (int i = 10; i < 21; i++) {

            if (i % 2 == 0) { // if i is even
                continue; // skips the current iteration
            }

            System.out.println(i);
        }*/
public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 10; i < 21; i++) {

            if (i % 2 == 0) { // if i is even
                System.out.println("returning");
                return;
            } else {
                System.out.println(i);
            }
        }
    }
}
