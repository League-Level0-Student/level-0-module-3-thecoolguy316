import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot Obe = new Robot ();
public static void main(String[] args) {
	drawSquare();
}
public static void drawSquare() {
for (int i = 0; i <4;i++) {	
	Obe.move(50);
	Obe.turn(90);
}
}	
}
