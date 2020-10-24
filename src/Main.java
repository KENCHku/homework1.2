public class Main {

    public static void main(String[] args) {
        // write your code here
        Car objectA = new Car("Tesla", 2020, "X", Colors.GRAY);
        Engine objectB = new Engine(new Petrol("petrol"), 200, "Mercedes", 2020, "Maybach", Colors.SILVER);
        Engine objectC = new Engine(new Petrol( "electro"), 150,
                "Tesla", 2020, "S", Colors.GREEN);


        objectA.distance(10, 0.200);
        objectA.getInfo();
        objectB.distance(100);
        objectB.getInfo();
        objectC.distance(40, 5.5);
        objectC.getInfo();
        objectC.distance(5.5);
        objectC.getInfo();

        System.out.println("\n############################");
        System.out.println("Copies from objectB to objectC");

        objectC.copy(objectB);

        System.out.println(objectC.copyInfo());
    }
}
