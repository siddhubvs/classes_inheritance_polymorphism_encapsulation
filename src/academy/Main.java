package academy;

public class Main {
	public static void main(String[] args) {


		Motherboard motherboard = new Motherboard("G25", "Intel", 5, 5, "MICROSOFT WINDOWS");
		Dimensions dimensions = new Dimensions(45, 23, 67);
		Case thecase = new Case("F25", "kop", "ter", dimensions);
		Resolution nativeresolution = new Resolution(65, 96);
		Monitor monitor = new Monitor("G25", "Intel", 45, nativeresolution);
		PC pc = new PC(thecase, monitor, motherboard);

		pc.getmonitor().drawPixelAt(5,9,"RED");
		pc.getmotherboard().loadProgram("WINDOWS XP");
		pc.getthecase().pressPowerButton();

	}
}