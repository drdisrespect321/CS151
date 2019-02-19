import java.util.Scanner;

/**
   A telephone that takes simulated keystrokes and voice input
   from the user and simulates spoken text.
*/
public class Telephone
{
   /**
      Construct phone object.
      @param aScanner that reads text from a character-input stream
   */
   public Telephone(Scanner aScanner)
   {
      scanner = aScanner;
   }

   /**
      Speak a message to System.out.
      @param output the text that will be "spoken"
   */
   public void speak(String output)
   {
      System.out.println(output);
   }

   /**
      Loops reading user input and passes the input to the
      Connection object's methods dial, record or hangup.
      @param c the connection that connects this phone to the
      voice mail system
   */
   public void run(Connection c)
   {
	  speak("To leave a message, press (1), to access your mailbox, press(2)");
      boolean more = true;
      String option = "";
      while (more)
      {
    	    String input = scanner.nextLine();
            if (input == null) return;
            if (!"12".contains(input) && option.isEmpty()) {
            	  speak("To leave a message, press (1), to access your mailbox, press(2)");
            	  continue;
              }
            if (option.isEmpty()) {
            	option += input;
            }
            
            
            if (option.equals("1") || option.equals("2") ||option.startsWith("ok")) {
            	if (input.equalsIgnoreCase("H")) {
                    c.hangup();
                    option = "";
            	}
                 else if (input.equalsIgnoreCase("Q"))
                    more = false;
                 else if (c.getState() == 1 && input.equals("#") && (c.accumulatedKeys().isEmpty()|| !c.accumulatedKeys().matches("\\d+"))) {
              	   speak("invalid keys\n");
 
                 }
                	 
                 else if (option.equals("1")) {
                 	
                 	speak("Enter mailbox number followed by #");
                 	option = "ok";
                 	
                 }
                 else if (option.equals("2")) {
                	 speak("Please enter your mailbox numberfollowed by #");
                	 option = "ok2";
             
                 }
                	 
                 else if (input.length() == 1
                    && "1234567890#*".contains(input)) {
                	 Boolean greet = option.equals("ok");
                 
                    c.dial(input,greet);
                 }
                 else
                    c.record(input);
            }
      }
   }

   private Scanner scanner;
}
