import java.awt.event.*;
import java.util.Calendar;

import javax.swing.Timer;

/**
   This program shows a Hello, World once per second.
*/
public class TimerTester
{
   public static void main(String[] args)
   {
 
	
      ActionListener listener = new 
    		  ActionListener()
    		  {
    	         public void actionPerformed(ActionEvent event)
    	         {
    	        	 Calendar now = Calendar.getInstance();
    	        	 
    	        	 System.out.println("Hello, World" +"  " + now.getTime());
    	        	 
    	         }
    		  };
    		  
    		  //event -> System.out.println("Hello, World");
      final int DELAY = 1000;
      Timer t = new Timer(DELAY, listener);
      t.start();

   }
}
