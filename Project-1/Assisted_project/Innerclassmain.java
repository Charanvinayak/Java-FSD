//non-static inner class
/* class Outer {
	
	 int n = 7;
	 void display() {
		 System.out.println("Hello outer class");
	 }
	 
	 class Inner{
		 int x = 10;
		 void print() {
			 System.out.println("Hello inner class");
		 }
		 
	 }
	 
}






public class Innerclassmain {
	public static void main(String[] args) {
		Outer out = new Outer();
		System.out.println(out.n);
		out.display();
		Outer.Inner inner = out.new Inner();
		System.out.println(inner.x);
		inner.print();
		
	}

}*/

///Static inner class


 class Outer {
	
	 int n = 7;
	 void display() {
		 System.out.println("Hello outer class");
	 }
	 
	public  static class Inner{
		 int x = 10;
		 void print() {
			 System.out.println("Hello inner class");
		 }
		 
	 }
	 
}






public class Innerclassmain {
	public static void main(String[] args) {
		Outer out = new Outer();
		System.out.println(out.n);
		out.display();
		
		Outer.Inner in = new Outer.Inner();
		in.print();
		System.out.println(in.x);
		
		
		
	}

}




