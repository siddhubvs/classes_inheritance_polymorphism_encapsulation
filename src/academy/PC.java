package academy;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getthecase() {
        return theCase;
    }

    public Monitor getmonitor() {
        return monitor;
    }

    public Motherboard getmotherboard() {
        return motherboard;
    }
}


