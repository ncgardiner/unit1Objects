import java.awt.Color;
import javax.swing.JFrame;
public class BrighterColor
{
    public static void main( String[] args)
    {
         JFrame frame = new JFrame();
         frame.setSize(200, 200);
         Color myColor = new Color(50,100,150);
         Color newColor = myColor.brighter();
         frame.getContentPane().setBackground(newColor);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
    }
}
    