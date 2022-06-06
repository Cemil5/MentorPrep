package test.topics.classes;


public class Runner {
    public static void main(String[] args) {

        Car honda = new Car();

        System.out.println(honda);
        honda.gearUp();
        System.out.println("honda.currentGear = " + honda.currentGear);

    }
}
