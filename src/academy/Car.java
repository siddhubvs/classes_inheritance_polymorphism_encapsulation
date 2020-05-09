package academy;

public class Car extends vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean ismanual;

    private int currentgear;


    public Car(String name, String size, int wheels, int doors, int gears, boolean ismanual,int currentgear) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.ismanual=ismanual;
        this.currentgear=1;

    }
    public void changedgears(int currentgear){
        this.currentgear=currentgear;
        System.out.println("car is at gear "+currentgear);
    }
    public void changevelocity(int velocity,int direction){
        speed(velocity,direction);
        System.out.println("car is moving at "+velocity+" direction "+direction);
    }


}


