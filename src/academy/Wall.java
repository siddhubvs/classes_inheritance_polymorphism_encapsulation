package academy;

public class Wall {
    private String direction;
    private Measurements measurements;


    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public Wall(Measurements measurements) {
        this.measurements = measurements;
    }

    public Measurements getMeasurements() {
        return measurements;
    }
}

