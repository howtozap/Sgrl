package javaPrograme;

public class Light implements Switch {
	@override
	public void Switchon() {
		System.out.println("light Switch on");
	}
	@override
	public void Switchoff() {
		System.out.println("led light switch off");
	}
}

