///Implicit typecasting
public class ImplicitExplicittypecast {

	
	public static void main(String[] args) {
		
		System.out.println("Implicit Typecasting");
		byte a = 27;
		System.out.println("byte value " +a);
		
		short b = a;
		System.out.println("short value "+b);
		
		int c = a;
		System.out.println("int value "+c);
		
		long d = a;
		System.out.println("long value" +d);
		
		float e = a;
		System.out.println("float value "+e);
		
		double f = a;
		System.out.println("double value "+f);
		
		
		////expllicit typecasting
		
	
		double z = 99.9;
		int x = (int) z;
		System.out.println("Explicit Typecasting");
		System.out.println("int value is " +x);
		
		
	}
}
