package weeks.week_08;

public class MyRefactoredThiefFox {
    public static void main(String[] args) {
        Fox fox1 = new Fox();
        fox1.setInfo("Fox1", true, true, "BLACK", 0);

        Fox fox2 = new Fox();
        fox2.setInfo("Fox2", true, true, "BLACK", 2);

        Fox fox3 = new Fox();
        fox3.setInfo("Fox3", true, true, "BLACK", 3);

        Fox fox4 = new Fox();
        fox4.setInfo("Fox4", true, true, "GRAY", 3);

        checkIfSuspected(fox1);
        checkIfSuspected(fox2);
        checkIfSuspected(fox3);
        checkIfSuspected(fox4);
    }

    public static void checkIfSuspected(Fox fox){
        boolean isSuspected = fox.isWearCoat && fox.hasATorch && fox.coatColor.equalsIgnoreCase("BLACK") && fox.bagCount ==3;
        if (isSuspected){
            System.out.println("\uD83E\uDD8A "+fox.name +" is one of suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A "+fox.name+" cleared of charges!");
        }
    }


}
