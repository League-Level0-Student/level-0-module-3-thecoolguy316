//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot yoDA = new Robot();
		for (int i = 0; i < 4; i++) {
			// 3. Ask the user what color they would like the robot to draw
			String Q = JOptionPane.showInputDialog(null, "What color would you like?");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (Q.equalsIgnoreCase("red")) {
				yoDA.setPenColor(Color.red);
			} else if (Q.equalsIgnoreCase("blue")) {
				yoDA.setPenColor(Color.blue);
			} else if (Q.equalsIgnoreCase("yellow")) {
				yoDA.setPenColor(Color.yellow);
			}
			// 6. If the user doesn’t enter anything, choose a random color
			else {
				yoDA.setRandomPenColor();
			}
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10

			// 2. Make the robot draw a shape (this will take more than one line of code)
			yoDA.setSpeed(75);
			yoDA.setPenWidth(10);
			for (int i1 = 0; i1 < 4; i1++) {
				yoDA.penDown();
				yoDA.move(200);
				yoDA.turn(90);
			}
		}
	}
}
