
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionMain {

	private static CircleIcon icon;

	private static JLabel label;

	public static void main(String[] args) {
// create a frame 
		JFrame frameObj = new JFrame();

// create the button object and set the text as "Red"
		JButton rButton = new JButton("Red");

// set color of the as red
		rButton.addActionListener(createColorButtonListener(Color.RED));

// create the button object and set the text as "Green"
		JButton gButton = new JButton("Green");

// set color of the button as green
		gButton.addActionListener(createColorButtonListener(Color.GREEN));

// create the button object and set the text as "blue"
		JButton bButton = new JButton("Blue");

// set color of the button as green
		bButton.addActionListener(createColorButtonListener(Color.BLUE));

// set the default button color as "Red"
		icon = new CircleIcon(100, Color.RED);

// create a label object
		label = new JLabel(icon);

// set the layout into frame using the frame object
		frameObj.setLayout(new FlowLayout());

// add the button into frame using the frame object
		frameObj.add(rButton);

// add the button into frame using the frame object
		frameObj.add(gButton);

// add the button into frame using the frame object
		frameObj.add(bButton);

// add the label into frame using the frame object
		frameObj.add(label);

// set the close option into the frame using the frame object
		frameObj.setDefaultCloseOperation(frameObj.EXIT_ON_CLOSE);

// size the frame using the frame object
		frameObj.pack();

// make a frame as visible, initially it is invisible
		frameObj.setVisible(true);
	}

// this method handles the action event
	public static ActionListener createColorButtonListener(final Color theColor) {
		return new ActionListener() {
// this method repaint the label color when icon is changed
			public void actionPerformed(ActionEvent event) {
// set the color for icon using the icon object
				icon.setColor(theColor);

// paint the color for label using the label object
				label.repaint();
			}
		};
	}
}