public class BranchingStatements {
    public static void main(String[] args) {
        example();
        breakExample();

        for (int i = 10; i < 21; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 10; i < 21; i++) {

            if (i % 2 == 0) {

            } else {     System.out.println(i);
            }
        }


    }

    public static void example(){
        for (int i = 10; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.println("returning");
                return;
            } else {
                System.out.println(i);
            }
        }
    }

    public static void breakExample(){
        int x = 0;
        while(true){
            x++;
            if (x == 25) {
                System.out.println("Break now...");
                break;
            }
        }
    }
}
