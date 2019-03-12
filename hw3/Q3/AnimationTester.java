import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      int number = 2;
      int x_dinstance = 0;
      int y_dinstance = 50;
      ArrayList<MoveableShape> shapes = new ArrayList<>();
      for (int i = 0; i < number; ++i)
      {
    	  shapes.add(new CarShape(0 + i * x_dinstance, 0 + i * y_dinstance, CAR_WIDTH));
      }

      ShapeIcon icon = new ShapeIcon(shapes,
            ICON_WIDTH, ICON_HEIGHT);

      final JLabel label = new JLabel(icon);
      frame.setLayout(new FlowLayout());
      frame.add(label);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

      final int DELAY = 100;
      // Milliseconds between timer ticks
      for (int i = 0; i < number; i++)
      {
    	  final int ii = i;
    	  Timer t = new Timer(DELAY, event ->
          {
             shapes.get(ii).move();
             label.repaint();
          });
       t.start();
      }
    
   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}
