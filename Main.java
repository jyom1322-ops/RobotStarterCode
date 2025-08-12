import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
//This is the starter code for Karel the Robot AP CSA Thai

public class Main implements Directions {
  public static void main(String[] args) 
	{
		//My robot's name is karel
    Robot karel = new Robot(9,4,East,100);
    World.setVisible(true);
    World.setSize(10,10);
    World.setDelay(100);

    Robot andy = new Robot(9,6,East,100);
    World.setSize(10,10);
    World.setDelay(100);

    turnRight(karel);
    karel.putBeeper();
		karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.move();
    turnRight(karel);
    karel.move();
    karel.putBeeper();
    karel.move();
    turnRight(karel);
    karel.move();
    karel.putBeeper();

    andy.putBeeper();
    andy.move();
    turnRight(andy);
    andy.move();
    andy.putBeeper();
    andy.move();
    andy.turnLeft();
    andy.move();
    andy.putBeeper();
    andy.move();
    andy.turnLeft();
    andy.move();
    andy.putBeeper();
    turnRight(andy);
    andy.move();
    andy.turnLeft();
    andy.move();
    andy.putBeeper();
    andy.turnLeft();
    andy.turnLeft();
    andy.move();
    andy.putBeeper();
    andy.move();
    andy.putBeeper();
    andy.move();
    andy.putBeeper();
    andy.move();
    andy.putBeeper();
    andy.move();
    andy.putBeeper();
    turnRight(andy);
    andy.move();
    andy.move();
    andy.move();
    andy.move();
    andy.putBeeper();
    turnRight(andy);
    andy.move();
    andy.putBeeper();
    andy.move();
    andy.putBeeper();
    andy.move();
    andy.putBeeper();
    andy.move();
    andy.putBeeper();

    }
    public static void turnRight(Robot placeholder){
      placeholder.turnLeft();
      placeholder.turnLeft();
      placeholder.turnLeft();
  }
}