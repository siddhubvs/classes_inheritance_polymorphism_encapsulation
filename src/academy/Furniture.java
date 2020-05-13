package academy;

public class Furniture {
    private String name;
    private int number;
    private String colour;
    private int price;

    public Furniture(String name, int number, String colour, int price) {
        this.name = name;
        this.number = number;
        this.colour = colour;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }
    public void furnitureposition(String position,int number){
        System.out.println(number+" furniture structures are in  "+position);
    }
}
