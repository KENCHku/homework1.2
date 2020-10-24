public final class Engine extends Car {
    private double speed;
    private Petrol petrol;
    // private String petrol;

    public Engine(Petrol petrol ,double speed, String name, int year, String model, Colors colors) {
        super(model, year, name, colors);
        this.speed = speed;
        this.petrol=petrol;
    }

  /*  public String getPetrol(){
        return petrol;
    }*/

    public Petrol getPetrol() {
        return petrol;
    }

    public double getSpeed() {
        return speed;
    }

    public void distance(int distance) {
        super.distance(distance);
    }




    public void setPetrol(Petrol petrol) {
        this.petrol = petrol;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Скорость: " + speed +
                "\n Тип топлива: " + petrol.getType());
    }
       /* System.out.println(" Модель: "+super.getModel()+
                "\n Цвет: "+super.getColors()+
                "\n Название: "+super.getName()+
                "\n Год выпуска: "+super.getYear()+
                "\n Скорость: " +speed);*/
//dop
       public void copy(Engine x){
           this.setPetrol(x.getPetrol());
       }

    public String copyInfo(){
        return "\nType of petrol " + petrol.superInfo();
    }
}
