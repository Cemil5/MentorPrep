package taskTests;

/**
 * All the animals are having a feast! Each animal is bringing one dish. There is just one rule:
 * the dish must start and end with the same letters as the animal's name.
 *
 * For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
 * Write a method that takes the animal's name and dish as arguments and returns true or false to indicate
 * whether the beast is allowed to bring the dish to the feast.
 * Assume that beast and dish are always lowercase strings, and that each has at least two letters.
 * Beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string.
 * They will not contain numerals.
 */

public class AnimalFeast {

    public static void main(String[] args) {

        System.out.println(isDishAllowed("great blue heron", "garlic naan"));
        System.out.println(isDishAllowed("chickadee", "chocolate cake"));
        System.out.println(isDishAllowed("chickade", "choco0late cake"));
    }

    public static boolean isDishAllowed(String name, String dish) {

        boolean checkInput = name.charAt(0) != '-' && dish.charAt(0) != '-' && name.charAt(name.length() - 1) != '-' && dish.charAt(name.length() - 1) != '-';
        checkInput = checkInput && name.charAt(0) != ' ' && dish.charAt(0) != ' ' && name.charAt(name.length() - 1) != ' ' && dish.charAt(name.length() - 1) != ' ';

        checkInput = checkInput && name.length() < 2 && dish.length() < 2;

        if (checkInput) {
            System.out.println("invalid input");
            return false;
        }

        for (char ch = '0'; ch <= '9'; ch++) {
            if (name.contains(ch + "") || dish.contains(ch + "")) {
                System.out.println("invalid input.");
                return false;
            }
        }

        return name.charAt(0) == dish.charAt(0) &&
                name.charAt(name.length() - 1) == dish.charAt(dish.length() - 1);
    }


}
