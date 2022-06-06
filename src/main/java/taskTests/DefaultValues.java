package taskTests;

public class DefaultValues {
    int anInt;
    char aChar;
    String string;
    double aDouble;

    public String toString() {
        return "DefaultValues{" +
                "anInt=" + anInt +
                ", aChar=" + aChar +
                ", string='" + string + '\'' +
                ", aDouble=" + aDouble +
                '}';
    }

    public static void main(String[] args) {
        DefaultValues defaultValues = new DefaultValues();
        System.out.println(defaultValues);
        System.out.println("\u0000");
    }
}
