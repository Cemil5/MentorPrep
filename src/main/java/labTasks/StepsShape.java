package labTasks;

public class StepsShape {
    public static void main(String[] args) {
        solution0();
        System.out.println();
        solution1();
        System.out.println();
        solution2();
    }

    static void solution0() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void solution5() {
        String result = "";
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= i; j++){
                result += " * ";
            }
            result += "\n";
        }
        System.out.println(result);
    }

    static void solution1() {
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                if (i >= j) {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }

    static void solution2() {
        String star = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= 1; j++) {
                star += " *";
                System.out.println(star);
            }
        }
    }

}
