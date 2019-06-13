package Mayis5;

public class Horse {

		String breed;
		int age;
		String color;
		double height;
		

	public static void main (String [] args) {
		
		
		Horse h1=new Horse();
		
		
		h1.breed="arabian";
		h1.age=3;
		h1.color="red";
		h1.height=4.3;
		
		Horse h2=new Horse();
		

		h2.breed="turk";
		h2.age=1;
		h2.color="greem";
		h2.height=55.1;
		
		
		System.out.println(h1.color);
		System.out.println(h2.height);
		
		h1.color="brown";  // updated
		
		System.out.println(h1.color);
		System.out.println(h2.color);
		
	}

}
