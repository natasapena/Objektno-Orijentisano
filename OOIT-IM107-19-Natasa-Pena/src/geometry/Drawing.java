package geometry;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.Color;
public class Drawing extends JPanel {
	
	private Object[] shapes = new Object[10];
	
	public Drawing() {
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 255, 255));
		add(desktopPane);

		shapes[0] = new Point(80, 100);
		shapes[1] = new Line(new Point(200, 80), new Point(250, 180));
		shapes[2] = new Circle(new Point(50, 50), 40);
		shapes[3] = new Rectangle(new Point(130, 30), 40, 20);
		shapes[4] = new Donut(new Point(100, 150), 40, 20);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < shapes.length; i++) {
			Object obj = shapes[i];
			if (obj != null) {
				if (obj instanceof Point) {
					Point p = (Point) obj;
					p.draw(g);
				} else if (obj instanceof Line) {
					Line l = (Line) obj;
					l.draw(g);
				} else if (obj instanceof Circle) {
					Circle c = (Circle) obj;
					c.draw(g);
				} else if (obj instanceof Rectangle) {
					Rectangle r = (Rectangle) obj;
					r.draw(g);
				} else if (obj instanceof Donut) {
					Donut d = (Donut) obj;
					d.draw(g);
				}
			}
		}
	}


	}

