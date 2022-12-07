package Uris.zadaci;

public class Computer {
	
	private int RAM;
	private String OS;
	private boolean PowerOn;

	public Computer ( ) {

	}

	public Computer ( int RAM , String OS, boolean PowerOn) {
	this.RAM=RAM;
	this.OS=OS;
	this.PowerOn= PowerOn;
	}
	public  void onOff() {
	if (PowerOn) {
	PowerOn= false;
	}else {
	PowerOn = true;
	}
	}

	public int getRAM() {
	return RAM;
	}
	public void setRAM(int rAM) {
	RAM = rAM;
	}
	public String getOS() {
	return OS;
	}
	public void setOS(String oS) {
	OS = oS;
	}
	public void setRam (int ram) {
	boolean check= false;
	for (int i=2;i<=128; i = i*2) {
	if(ram == i) {
	this.RAM=ram;
	/*c1.Ram=Ram;*/
	check=true;
	}
	}if(!check) {
	System.out.println("Moguce vrednosti rama su:"+"2,4,6,8,16,32,64,128");
	}
	}
	public boolean isPowerOn() {
	return PowerOn;
	}
	public void setPowerOn(boolean powerOn) {
	PowerOn = powerOn;
	}

	/*Metode*/

}
