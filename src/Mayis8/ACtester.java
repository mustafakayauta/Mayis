package Mayis8;

public class ACtester {

	public static void main(String[] args) {
		
		AirConditioner ac1=new AirConditioner();
		
		ac1.brand="Samsung";
		ac1.currentTemp=79.8f;
		ac1.isOn=true;
		
		ac1.displayBrand();
		ac1.showCurrenTemp();
		ac1.displayAllinfo();
		
		ac1.turnOff();
		ac1.turnOn();
		ac1.showCurrenTemp();
		ac1.increaseTemp(10);
		ac1.decreaseTemp(20);
		ac1.setTemperature(80f);
		System.out.println(ac1.currentTemp);
	}
	

}
