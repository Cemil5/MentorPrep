package labTasks;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "\t x  " + j + "\t =  " + i * j + "\t |   \t");
            }
            System.out.println();
        }
    }
}
