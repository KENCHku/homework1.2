public final class Engine extends Car{
    private double speed;

    public Engine(String name, int year, String model, Colors colors, double speed) {
        super(name, year, model, colors);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void distance(int distance) {
        super.distance(distance);
    }

    public void getInfo(){
        System.out.println(" Модель: "+super.getModel()+
                "\n Цвет: "+super.getColors()+
                "\n Название: "+super.getName()+
                "\n Год выпуска: "+super.getYear()+
                "\n Скорость: " +speed);
    }
}
