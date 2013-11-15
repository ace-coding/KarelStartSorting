import kareltherobot.Robot;

public class BetterRobot extends Robot {

	public BetterRobot(int arg0, int arg1, Direction arg2, int arg3) {
		super(arg0, arg1, arg2, arg3);

	}

	public void moveTo(int y, int x) {
		while (street() < y) {
			while (!facingNorth()) {
				turnLeft();
			}
			move();
		}
		while (street() > y) {
			while (!facingSouth()) {
				turnLeft();
			}
			move();
		}
		while (avenue() < x) {
			while (!facingEast()) {
				turnLeft();
			}
			move();
		}
		while (avenue() > x) {
			while (!facingWest()) {
				turnLeft();
			}
			move();
		}
	}

	public void move(int steps) {
		for (int i = 0; i < steps; i++) {
			move();
		}
	}

	public int getNumBeeps() {
		return beepers();
	}
	
	public void placeAllBeeps(){
		while(!facingNorth()){
			turnLeft();
		}
		while(anyBeepersInBeeperBag()){
			putBeeper();
			move();
		}
	}
}