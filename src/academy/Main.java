package academy;



class car {
    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;

    public car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startengine() {
        return ("Car->startengine()");

    }

    public String accelerate() {
        return("Car->accelerate()");

    }

    public String setbrakes() {
        return ("Car->setbrakes()");
    }
}
class AUDI extends car {
    public AUDI() {
        super(5, "Audi");
    }

    @Override
    public String startengine() {
        return("AUDI->startengine()");
    }

    @Override
    public String accelerate() {
        return ("AUDI->accelerate()");
    }

    @Override
    public String setbrakes() {
        return ("AUDI->setbrakes()");
    }
}
class BMW extends car{
    public BMW() {
        super(4, "BMW");
    }

    @Override
    public String startengine() {
        return ("BMW->startengine()");
    }

    @Override
    public String accelerate() {
        return ("BMW->accelerate()");
    }

    @Override
    public String setbrakes() {
        return ("BMW->setbrakes()");
    }
}
class BENZ extends car{
    public BENZ() {
        super(5, "BENZ");
    }

    @Override
    public String startengine() {
        return ("BENZ->startengine()");
    }

    @Override
    public String accelerate() {
        return ("BENZ->accelerate()");
    }

    @Override
    public String setbrakes() {
        return ("BENZ->setbrakes()");
    }
}



    public class Main {
        public static void main(String[] args) {
            for(int i=1; i<11; i++) {
                car Car = randomcar();

                System.out.println(Car.startengine());
                System.out.println(Car.accelerate());
                System.out.println(Car.setbrakes());
            }
        }

        public static car randomcar() {
            int randomNumber = (int) (Math.random() * 3) +1;
            System.out.println("Random number generated was: " + randomNumber);
            switch (randomNumber) {
                case 1:
                    return new AUDI();
                case 2:
                    return new BMW();
                case 3:
                    return new BENZ();

                default:return null;
            }

        }
    }

