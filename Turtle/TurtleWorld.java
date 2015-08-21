import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
 throws InterruptedException
{
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle banana = new Turtle(turtleWorld);
        banana.setBodyColor(Color.RED);
        turtle.setBodyColor(Color.GREEN);
        banana.setPenColor(Color.RED);
        turtle.setPenColor(Color.GREEN);
        banana.penUp();
        turtle.penUp();
        turtle.setWidth(100);
        turtle.setHeight(100);
        banana.setWidth(100);
        banana.setHeight(100);
        turtle.turnRight();
        banana.turnLeft();
        turtle.backward(90);
        banana.backward(90);
        int x = 0;
        while(x<=360)
        {
            turtle.turn(1);
            turtle.forward(2);
            banana.turn(1);
            banana.forward(2);
            x+=1;
            Thread.sleep(50);
        }
        
    }
}
