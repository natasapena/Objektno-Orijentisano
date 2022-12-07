package Uris.zadaci;

public class Automobil {

	private boolean On;
	private int brzina;
	private String marka;

	public Automobil (boolean On) {
	this.On=On;
	}
	/*NASLEDJIVANJE KONSTRUKTORA:*/
	public Automobil( boolean On, int brzina) {
	this(On);
	if(brzina<=6) {
	this.brzina= brzina;
	}
	}

	public int getBrzina() {
	return brzina;
	}

	public void promeniBrzinu(int brzina) {
	if (brzina- this.brzina >1 && brzina - this.brzina<0) {
	System.out.println("Nedozvoljen prenos");
	}else if(brzina-this.brzina <0) {
	System.out.println("Nedozvoljen prenos");
	}else
	this.brzina=brzina;
	}
}
