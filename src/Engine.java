public final class Engine extends Car{
    private double speed;
    private String typeOfPetrol;
   // private String petrol;

    public Engine(String name, int year, String model, Colors colors, String typeOfPetrol, double speed) {
        super(/*model, colors,*/ name, year);
        this.speed = speed;
        this.typeOfPetrol=typeOfPetrol;
       // this.petrol=petrol;
    }

  /*  public String getPetrol(){
        return petrol;
    }*/

    public double getSpeed() {
        return speed;
    }

    public void distance(int distance) {
        super.distance(distance);
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("Скорость: " +  speed+
                "\n Тип топлива: " + typeOfPetrol);
    }
       /* System.out.println(" Модель: "+super.getModel()+
                "\n Цвет: "+super.getColors()+
                "\n Название: "+super.getName()+
                "\n Год выпуска: "+super.getYear()+
                "\n Скорость: " +speed);*/

}
