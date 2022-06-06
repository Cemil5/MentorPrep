package labTasks;

public class Alphabets {
    public static void main(String[] args) {
        solution1();
        System.out.println();
        solution2();
        System.out.println();
        solution3();


    }

    static void solution1(){
        for (char j = 'A'; j <= 'E'; j++) {
            for (char i = 'a'; i < 'z'; i++) {

                System.out.print(j + "" + i + " ");
            }
            System.out.println();
        }
    }

    static void solution2(){

    }

    static void solution3() {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'a'; j <= 'y'; j++) {
                System.out.print(" " + i + "" + j + "");
            }
            System.out.println();
        }

    }
}

