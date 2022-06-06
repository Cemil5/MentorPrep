public class Operators {

    public static void main(String[] args) {

        int x = 10;
        int y = 22;
        double a = 10;
        double b = 22;

        // Arithmetic Operators
        System.out.println(x + y);  // 32
        System.out.println(x - y);  // -12
        System.out.println(x * y);  // 220
        System.out.println(y / x);  // 2
        System.out.println(x / y);  // 0 -> Division of integers result to 0
        System.out.println(y % x);  // 2  -> (10 x 2 = 20)  -> (22 - 20 = 2)
        System.out.println(x % y);  // 10 -> (22 x 0 = 0)  -> (10 - 0 = 10)
        System.out.println(a % b);  // 10.0

        System.out.println("-----------------------");

        //  Shorthand Operators
        System.out.println( x+=y );  // x = x + y = 32
        System.out.println( x*=y );  // x = x * y = 704
        System.out.println( x%=y );  // x = x % y = 0
        System.out.println( a%=b );  // a = a % b = 10.0

        System.out.println("-----------------------");

        // Relational Operators
        System.out.println( x > y );  // false
        System.out.println( x < y );  // true
        System.out.println( x == y ); // false
        System.out.println( a == x ); // true

        System.out.println("-----------------------");

        // Unary Operators
        System.out.println( x+++x );     // 21 (x++ + x) -> (10 + 11 = 21)
        System.out.println( x++ + ++y ); // 34 (11 + 23 = 34)
        System.out.println( x+++""+x );  // 1213 -> (x++ + "" + x)
        System.out.println( ++x % 5 );   // 4 -> (14 % 5)
        System.out.println( ++x );       // 15

        System.out.println("-----------------------");

// Operator Precedence
        int z = 2;
        int result = z++ + z++ * --z / z++ - --z + 3;
        //   2  +  (3  *   3 / 3)   -  3 + 3
        //   2  +        3          -  3 + 3 = 5
        System.out.println("result = " +result);




    }
}
