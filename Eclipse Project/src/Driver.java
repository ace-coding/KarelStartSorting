import java.util.ArrayList;
import java.util.Random;

import kareltherobot.*;

public class Driver implements Directions {

	BetterRobot robbie;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Driver().start();
	}

	private void start() {
		Random die = new Random();
		
		//robots IS THE NAME OF THIS LIST
		//THIS LIST CONTAINS 5 ROBOTS WITH A RANDOM NUMBER OF BEEPERS
		//YOU WILL SORT THE ROBOTS IN THIS LIST FROM MOST TO LEAST BEEPERS
		ArrayList<BetterRobot> robots = new ArrayList<BetterRobot>();
		
		//THIS IS WHERE YOU WILL PUT THE SORTED ROBOTS
		ArrayList<BetterRobot> sorted = new ArrayList<BetterRobot>();

		for (int i = 0; i < 5; i++) {
			robots.add(new BetterRobot(1, i, North, die.nextInt(10) + 1));
		}
		
		//LIST METHODS YOU NEED TO KNOW
		//WITH .get(INDEX) YOU WILL BE ABLE TO ACCESS THE ROBOT IN THAT SPOT OF THE LIST!!
		//THE FIRST ITEM IN THE LIST HAS AN INDEX VALUE OF 0, THE SECOND HAS A VALUE OF 1 AND SO ON
		//robots.get(0) ALLOWS YOU TO ACCESS THE FIRST ROBOT IN THE LIST
		//.size() TELLS YOU THE SIZE OF THE LIST
		//int x = robots.size() WILL CREATE A NEW NUMBER VALUE CALLED X THAT IS EQUAL TO THE SIZE OF THE LIST
		//.remove(INDEX) REMOVES THE ITEM AT A SPECIFIED LOCATION FROM THE LIST AND MOVES THE OTHERS OVER
		//robots.remove(0) WILL REMOVE THE FIRST ITEM IN THE LIST AND ALL OTHER ITEMS WILL MOVE OVER
		//SO THE SECOND ITEM IN THE LIST WILL NOW BE THE FIRST ITEM AND SO ON
		//.add(ROBBOT) WILL ADD A ROBOT TO THE END OF THE LIST
		//sorted.add(new Robot(1,1,North,4)) WILL ADD A NEW ROBOT TO THE LIST sorted WITH THE COORDS (1,1), DIRECTION NORTH, AND BEEPER COUNT 4
		//sorted.add(robots.remove(0)) WILL REMOVE THE FIRST ITEM FROM robots AND ADD IT TO THE END OF SORTED

		World.setVisible(true);
		// World.
		robbie = new BetterRobot(1, 1, East, 4);

		robbie.move();
		robbie.turnLeft();
		robbie.move();

		// THIS MOVES TO SPECIFIED COORDINATE
		// Y COMES FIRST IN THIS!!!
		robbie.moveTo(3, 4);

		robbie.turnLeft();

		// MOVES SPECIFIED NUMBER OF TIMES
		robbie.move(2);

		// EQUIVALENT TO THE CURRENT NUMBER OF BEEPERS A ROBOT HAS
		robbie.getNumBeeps();

		// PLACES ALL BEEPERS IN A LINE GOING NORTH
		robbie.placeAllBeeps();
	}
}