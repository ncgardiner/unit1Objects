import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setBodyColor(Color.GREEN);
        turtle.setPenColor(Color.BLUE);
        turtle.setPenWidth(10);
        turtle.penDown();
        turtle.forward(50);
        turtle.turnRight();
        turtle.forward(50);
        turtle.turnRight();
        turtle.forward(50);
        turtle.turnRight();
        turtle.forward(50);
    }
}
