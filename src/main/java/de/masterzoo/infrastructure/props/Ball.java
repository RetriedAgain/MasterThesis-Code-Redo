package de.masterzoo.infrastructure.props;

/**
 * A simple ball prop for testing.
 */
public class Ball extends Prop {

	private boolean isRolling;

	public void rollBall() {
		if (isRolling) {
			System.out.println("Great job! Keep the ball rolling!");
		} else {
			isRolling = true;
			System.out.println("You better start rolling!");
		}
	}
}
