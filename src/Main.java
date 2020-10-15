public class Main {

    public static void main(String[] args) {
        // write your code here
       Car objectA = new Car("X",  /* Colors.GRAY, "Tesla",*/ 2020 );
       Engine objectB = new Engine("Mercedes", 2020,
               "Maybach", Colors.SILVER, "Electro", 400);
       Engine objectC = new Engine("Truck", 2000,
               "CAT", Colors.GREEN, "Diesel", 50);


        objectA.distance(10, 0.200);
        objectA.getInfo();
        objectB.distance(100);
        objectB.getInfo();
        objectC.distance(40, 5.5);
        objectC.getInfo();
        objectC.distance(5.5);
        objectC.getInfo();
    }
}
