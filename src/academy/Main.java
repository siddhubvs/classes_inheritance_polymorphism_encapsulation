package academy;

public class Main {
	public static void main(String[] args) {

        Furniture furniture=new Furniture("Ikea",4,"Black",25000);
        Measurements measurements=new Measurements(45,25,120);
        Tv tv=new Tv("Bravia",52000,measurements);
        Bed bed=new Bed("double cat",4,25,5,4);
        Lamp lamp=new Lamp("glowing single",true,5);
        Wall wall=new Wall("south");
        Bedroom bedroom=new Bedroom(furniture,tv,lamp,bed,wall);

        bedroom.getTv().tvcontrol("on");
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWall();
        bedroom.getFurniture().furnitureposition("corner",8);





	}
}