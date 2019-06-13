package Mayis8;

import java.util.Arrays;
import java.util.Scanner;

public class AirConditioner {

	String brand;
	float currentTemp;
	boolean isOn;

	public void displayBrand() {
		System.out.println("the brand is " + brand);
	}

	public void showCurrenTemp() {

		System.out.println("current temp " + currentTemp);

	}

	public void displayAllinfo() {

		System.out.println("The brand is " + brand + "| The current temp is: " + currentTemp);
	}

	public void turnOn() {
		
		System.out.println("current AC is "+isOn);
		
		if(isOn==false) {
			isOn=true;
		}else {
			System.out.println("it is already on!!!");
		}
	}
	
	public void turnOff() {
		if(isOn)
			isOn=false;
		System.out.println("its been turned off");
	}
	
	public void increaseTemp(int increaseBy) {
		
		currentTemp=currentTemp+increaseBy;
		
		System.out.println("show updated temp: "+currentTemp);
		showCurrenTemp();
	}
	
	public void decreaseTemp(int decreaseBy) {
			
		currentTemp=currentTemp-decreaseBy;
		
		System.out.println("show updated temp: "+currentTemp);
		showCurrenTemp();   // method calling another method
	}
	public void setTemperature(float targetTemperature) {
		
		currentTemp=targetTemperature; 
		System.out.println("show updated temp: "+currentTemp);
		showCurrenTemp();
	}
	
}