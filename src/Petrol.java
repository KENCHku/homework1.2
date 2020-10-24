public class Petrol {


    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Petrol(String type) {

        this.type = type;
    }

    public String superInfo() {
        return "\nType of petrol = " + type;

    }
}
