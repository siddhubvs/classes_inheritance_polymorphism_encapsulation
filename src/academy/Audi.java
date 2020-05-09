package academy;

public class Audi extends Car {
    private int registeredyears;

    public Audi( int registeredyears) {
        super("Audi", "120 tonnes", 5, 5, 6, false,1);
        this.registeredyears = registeredyears;
    }





    public void accelerate(int rate) {
        int newvelocity = getVelocity() + rate;
        if (newvelocity == 0) {
            stop();
            changedgears(1);
        } else if (newvelocity >=0 && newvelocity <= 10)
            changedgears(1);
        else if (newvelocity > 10 && newvelocity <= 20)
            changedgears(2);
        else if (newvelocity > 20 && newvelocity <= 30)
            changedgears(3);
        else
            changedgears(4);

        if (newvelocity > 0)
            changevelocity(newvelocity, getDirection());


    }
}

