package geometry;

public class Test {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.setX(5);
		System.out.println("Kordinata x tacke P1 je "+ p1.getX());
		p1.setY(7);
		System.out.println("Kodinata y tacke P1 je "+ p1.getY());

		Point p2=new Point();
		p2.setX(10);
		p2.setY(15);

		double distance = p1.distance(p2.getX(), p2.getY());
		System.out.println("Distance is "+ distance);

		Line l1= new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(p1);
		int odtacke = p2.getX();
		int x = l1.getEndPoint().getX();
		System.out.println("Obe vrednosti "+ odtacke+ " "+ x);


		Point p= new Point();
		p.setX(3);
		p.setY(5);

		Circle c= new Circle();
		c.setCenter(p);
		c.setR(7);

		System.out.println("Centar kruga je tacka sa koordinatama: " );
		System.out.println("X: "+ c.getCenter().getX());
		System.out.println("Y: " + c.getCenter().getY());
		System.out.println("Poluprecnik kruga je "+ c.getR());

		double circleArea = c.area();
		System.out.println(circleArea);
		System.out.println(c.area());


		Circle c1= new Circle();
		c1.setCenter(new Point(3,5));

		Line l = new Line ();
		Line l2= new Line (p,p1);
		Line l3= new Line (p,p, true);
		Line l4= new Line (new Point(6,7), new Point (8,9));
	
		Point p4 = new Point (4,5);
		Point p5 = new Point (4,5);
		System.out.println(p4.toString());
		
		Line l5 = new Line (new Point (5,7), new Point (8,9));
		System.out.println(l5.toString());
		
		Circle c2 = new Circle (p4,5);
		System.out.println(c2.toString());
		System.out.println("Upper Left Point: (8,9), width:7, height: 11");
		
		Rectangle r = new Rectangle (p4, 5 ,6 );
		System.out.println(r.toString());
		
		System.out.println(p4.equals(p5));
		
		//Novi cas
		Donut d = new Donut (new Point(3,5), 8, 3);
		System.out.println(d.area());
		
		Circle c3 = new Circle (new Point (3,5), 8);
		System.out.println (c3.area());
	
		Point p6 = new Point (3,5);
		System.out.println(c3.equals(d));
		System.out.println(d.equals(c3));
		/* ovde treba jedno da mi je true, a drugo false 
		 * zato sto klasa Donut nasledjena od klase Circle
		 */
		
	}
	

		}

