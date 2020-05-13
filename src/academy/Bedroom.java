package academy;

public class Bedroom {
    private Furniture furniture;
    private Tv tv;
    private Lamp lamp;
    private Wall wall;
    private Bed bed;

    public Bedroom(Furniture furniture, Tv tv, Lamp lamp, Bed bed, Wall wall) {
        this.furniture = furniture;
        this.tv = tv;
        this.lamp = lamp;
        this.wall = this.wall;
        this.bed = bed;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Tv getTv() {
        return tv;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wall getWall() {
        return wall;
    }

    public Bed getBed() {
        return bed;
    }
}
