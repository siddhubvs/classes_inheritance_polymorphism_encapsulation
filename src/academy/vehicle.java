package academy;

public class vehicle {
    private String name;
    private String size;

    private int velocity;
    private int direction;

    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.direction=0;
        this.velocity=0;
    }
    public void speed(int velocity,int direction){
        this.velocity=velocity;
        this.direction=direction;
        System.out.println("vehicle moves at "+this.velocity+" in direction "+this.direction);

    }
    public void steer(int direction){
        this.direction+=direction;
        System.out.println("vehicle moving at direction" + this.direction);
    }
    public void stop(){
        this.velocity=0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getDirection() {
        return direction;
    }
}



