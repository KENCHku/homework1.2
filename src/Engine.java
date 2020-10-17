public final class Engine extends Car {
    private double speed;
    private Petrol typeOfPetrol;
    // private String petrol;

    public Engine(Petrol typeOfPetrol ,double speed, String name, int year, String model, Colors colors) {
        super(model, year, name, colors);
        this.speed = speed;
        this.typeOfPetrol=typeOfPetrol;
    }

  /*  public String getPetrol(){
        return petrol;
    }*/

    public Petrol getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public double getSpeed() {
        return speed;
    }

    public void distance(int distance) {
        super.distance(distance);
    }


    public void getInfo() {
        super.getInfo();
        System.out.println("Скорость: " + speed +
                "\n Тип топлива: " + typeOfPetrol.getName()+typeOfPetrol.getHealth());
    }
       /* System.out.println(" Модель: "+super.getModel()+
                "\n Цвет: "+super.getColors()+
                "\n Название: "+super.getName()+
                "\n Год выпуска: "+super.getYear()+
                "\n Скорость: " +speed);*/

}
