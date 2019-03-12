import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

// class definition that implements the Icon interface
public class CircleIcon implements Icon {
// declare the private variables
	private int size;
	private Color color;

// parameterized constructor
	public CircleIcon(int aSize, Color color) {
// assign the size
		size = aSize;
// assign the color
		this.color = color;
	}

// the setColor() method accepts "color" as an input parameter to set the color for icon
	public void setColor(Color color) {
// set the icon color
		this.color = color;
	}

	public int getIconWidth() {
// return the size of icon
		return size;
	}

// this method is implemented from Icon interface to set height for icon
	public int getIconHeight() {
// return the size of icon
		return size;
	}

// this method is implemented from Icon interface to draw and fill the color for circle
	public void paintIcon(Component c, Graphics g, int x, int y) {
// define "g2" object from Graphics2D class
		Graphics2D g2 = (Graphics2D) g;

// ellipse shape to draw the circle image
		Ellipse2D.Double planet = new Ellipse2D.Double(x, y, size, size);

// set the color for circle image
		g2.setColor(color);

// fill the color for circle image
		g2.fill(planet);
	}
}