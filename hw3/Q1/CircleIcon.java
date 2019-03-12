import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class CircleIcon implements Icon {

	private int size;
	private Color color;


	public CircleIcon(int aSize, Color color) {

		size = aSize;

		this.color = color;
	}

	public void setColor(Color color) {

		this.color = color;
	}

	public int getIconWidth() {

		return size;
	}


	public int getIconHeight() {

		return size;
	}


	public void paintIcon(Component c, Graphics g, int x, int y) {

		Graphics2D g2 = (Graphics2D) g;

		Ellipse2D.Double planet = new Ellipse2D.Double(x, y, size, size);

		g2.setColor(color);

		g2.fill(planet);
	}
}