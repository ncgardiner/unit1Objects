import java.awt.Color;
import java.util.Random;
public class TurtleProject
{
    public static void main(String[] args)
    throws InterruptedException
    {
        World world1 = new World(1500,1000);
        Turtle one = new Turtle(world1);
        Turtle two = new Turtle(world1);
        Turtle thr = new Turtle(world1);
        Turtle fou = new Turtle(world1);
        one.setBodyColor(Color.RED);
        two.setBodyColor(Color.BLUE);
        thr.setBodyColor(Color.MAGENTA);
        fou.setBodyColor(Color.GREEN);
        one.setWidth(20);
        one.setHeight(20);
        two.setWidth(20);
        two.setHeight(20);
        thr.setWidth(20);
        thr.setHeight(20);
        fou.setWidth(20);
        fou.setHeight(20);
        one.setPenColor(Color.BLUE);
        two.setPenColor(Color.RED);
        thr.setPenColor(Color.GREEN);
        fou.setPenColor(Color.MAGENTA);
        thr.penUp();
        fou.penUp();
        thr.turnLeft();
        fou.turnLeft();
        one.penDown();
        two.penDown();
        thr.penDown();
        fou.penDown();
        int loopVal;
        int count = 0;
        double random1 = Math.random();
        random1 *= 8;
        random1 += 1;
        int randomint1 = (int) random1;
        double random2 = Math.random();
        random2 *= 8;
        random2 += 1;
        int randomint2 = (int) random2;
        for (loopVal=0; loopVal<3000; loopVal++){
         one.turn(2);
         two.turn(-2);
         thr.turn(2);
         fou.turn(-2);
         one.forward(randomint1);
         two.forward(randomint1);
         thr.forward(randomint2);
         fou.forward(randomint2);
         Thread.sleep(3);
         count = count+1;
         if (count==180){
             count = 0;
             random1 = Math.random();
             random1 *= 8;
             random1 += 1;
             randomint1 = (int) random1;
             random2 = Math.random();
             random2 *= 8;
             random2 += 1;
             randomint2 = (int) random2;
            }
        }
    }
}