package academy;

public class Tv {
    private String name;
    private int price;
    private Measurements measurements;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Measurements getMeasurements() {
        return measurements;
    }

    public Tv(String name, int price, Measurements measurements) {
        this.name = name;
        this.price = price;
        this.measurements = measurements;


    }
    public void tvcontrol(String control){
        System.out.println("Tv is in "+control+" condition");
    }






}
