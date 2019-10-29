import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot Obe = new Robot();

	public static void main(String[] args) {

	}

	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Obe.setSpeed(100);
			Obe.penDown();
			Obe.move(100);
			Obe.turn(90);
		}
	}
	public static void drawTriangle() {
		for (int i = 0; i <3; i++) {
			Obe.setSpeed(100);
			Obe.penDown();
			Obe.move(100);
			Obe.turn(120);
			
		}
	}
	public static void drawCircle() {
		for (int i = 0; i <72; i++) {
		Obe.setSpeed(200);
		Obe.penDown();
		Obe.move(6);
		Obe.turn(5);
	}
	}		
}
