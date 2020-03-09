package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Random ran = new Random();
		Boolean goo = true;
		// 2. create an array of 5 robots.
		Robot[] rob = new Robot[9];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			rob[i].setSpeed(10);
		}
		// 4. make each robot start at the bottom of the screen, side by side,
		// facing up
		for (int i = 0; i < rob.length; i++) {
			rob[i].setX(50 + (100 * i));
			rob[i].setY(550);
		}

		// 5. use another for loop to iterate through the array and make each
		// robot move
		// a random amount less than 50.

		while (goo) {
			for (int i = 0; i < rob.length; i++) {
				rob[i].move(ran.nextInt(50));
				if (rob[i].getY() < 75) {
					goo = false;
					System.out.println("Robot "+ (i+1) + " Won");
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the
		// top of the screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}

}
