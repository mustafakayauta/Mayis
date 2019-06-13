package mAYIS7;

public class PhoneFactory {

	public static void main (String[] args) {
		
		phone iphone=new phone();
		
		iphone.brand="Apple";
		iphone.OS="IOS";
		iphone.capacity=64;
		iphone.ring();
		iphone.dial(6823311019L);
		
		
phone samsung=new phone();
		
	samsung.brand="Samsung";
	samsung.OS="Android";
	samsung.capacity=128;
	samsung.ring();
	samsung.dial(6823311019L);
	samsung.displayName();	
	System.out.println(samsung.capacity);
	
	phone pixel=new phone();
	
	pixel.brand="Google";
	pixel.OS="Android";
	pixel.capacity=256;
	pixel.ring();
	pixel.dial(6823311019L); 
	
	System.out.println(pixel.brand);
		
		
		
		
		
	}

}
