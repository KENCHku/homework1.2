public class Main {

    public static void main(String[] args) {
	// write your code here
        Car objectA = new Car("Mercedes", 2020,
                "S-class", Colors.SILVER);
        Engine objectB=new Engine("Bosch", 2000,
                "V8", Colors.BLACK, 200.0  );
        Engine objectC=new Engine("CAT", 2010,
                "V12", Colors.WHITE, 15.5  );


        objectA.distance(10, 0.200);
        objectA.getInfo();
        objectB.distance(100);
        objectB.getInfo();
        objectC.distance(40,5.5);
        objectC.getInfo();
        objectC.distance(5.5);
        objectC.getInfo();
    }
}
