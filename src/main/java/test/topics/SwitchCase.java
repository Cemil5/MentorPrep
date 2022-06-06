public class SwitchCase {

    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                //break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Can be improved!");
                //break;
            default:
                System.out.println("No comment");
        }

    }
}
