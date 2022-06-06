package test;

public class TestingCode {
    public String str2;

    void test() {
        str2 = "abc";
        int i = 0;
    }

    public static void main(String[] args) {
        String str = "cydeo";
//        for (int i = 0; i < str.length(); i++) {
//            str += str.substring(i, i + 1);
//        }
        System.out.println(str);

        int x = 5;

        if (x > 2 && x < 10) ;

        if (2 < x && x < 10) ;

        //  if (2 <  x < 10);

        while (x > 5)
            x = x + 2;
        System.out.println(x);

        double sum = 0;
        for (int i = 1; i <= 99; i++) {
            sum += i / (i + 1.0);
        }
        System.out.println(sum);

//        int i = 1;
//        while (i < 10) {
//            if ((i++) % 2 == 0) {
//                System.out.print(i + ", ");
//            }
//        }


    }

    public static void printDirectly() {

        int counter = 0;
        while (counter++ < 5) {
            System.out.println("Be yourself; everyone else is already taken.");
            // counter = counter + 1;
        }
    }

    interface Interface1 {
        static void print() {
            System.out.print("Hello");
        }
    }

    interface Interface2 {
        static void print() {
            System.out.print("World!");
        }
    }

    static void bitwiseOr() {
        boolean b1 = true, b2 = false;
        int i1 = 1, i2 = 2;
        System.out.println((i1 | i2) == 3);

        int i = 1 | 2 | 3 | 4 | 5;
        System.out.println("i = " + i);
        /*
        That's bit-wise OR.

When you OR the bits of the binary representations of all these integers, you get 7:

1 == 0..00001
2 == 0..00010
3 == 0..00011
4 == 0..00100
5 == 0..00101
-------------
7 == 0..00111
         */
    }

    static void arrayTest() {
        int[] array = {1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {  // array.size() is wrong
            System.out.print(array[i]);
        }

    }
}
