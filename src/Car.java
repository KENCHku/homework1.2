public class Car extends Transport {
    private String model;
    private Colors colors;


    public Car(String name, int year, String model, Colors colors) {
        super(name, year);
        this.model = model;
        this.colors = colors;
    }


    public String getModel() {
        return model;
    }

    public Colors getColors() {
        return colors;
    }

    public void distance(int distance) {
        System.out.println("Машина проехала " + distance + "км");
    }

    public void distance(int distance, double speed) {
        System.out.println("Машина проехала " + distance + "км," +
                "скорость = " + speed + "км/ч");
    }

    public final void distance(double liter) {
        System.out.println("Машина израсходовала " + liter +
                "горючего");
    }

    public void getInfo() {
        System.out.println(" Модель: " + model +
                "\n Цвет: " + colors +
                "\n Название: " + super.getName() +
                "\n Год выпуска: " + super.getYear());
    }
}
