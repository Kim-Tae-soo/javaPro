package kr.or.ddit.day13;

public class Tv {
	String color;		//default
	boolean power;		//default
	public int channel;	//public
	
	void powerOnOff() { //default
		power = !power;
	}
	
	public void channelUp() {	//public
		channel++;
	}
	
	void channelDown() {	//default
		channel--;
	}
}
