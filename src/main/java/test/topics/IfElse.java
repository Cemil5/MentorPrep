public class IfElse {
    public static void main(String[] args) {

        int grade = 90;
        if (grade <= 100 && grade >= 90) {
            System.out.println("excellent");
        } else if (grade <= 90 && grade >= 70) {
            System.out.println("good");
        } else if (grade <= 70 && grade >= 60) {
            System.out.println("pass");
        } else if (grade <= 60 && grade >= 50) {
            System.out.println("fail");
        }

        cleanCode(90);
    }

    public static void cleanCode(int grade){
        String result = "";
        if (grade <= 100 && grade >= 0) {
            if (grade >= 90) {
                result = "excellent";
            } else if (grade >= 70) {
                result = "good";
            } else if (grade >= 60) {
                result = "pass";
            } else {
                result = "fail";
            }
        } else {
            result = "invalid input";
        }
        System.out.println(result);
    }
}
