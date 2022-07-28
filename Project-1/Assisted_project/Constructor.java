//Parameterized COnstructor(with args)
/*public class Constructor {
Constructor(int a , int b){
	
	int c = a*b;
	System.out.println("the ans is "+c);
	
}
public static void main(String[] args) {
	Constructor obj = new Constructor(2,3);
	Constructor obj1 = new Constructor(4,5);
}
}
*/

//Default Constructor (without args)

public class Constructor{
	Constructor(){
		int a=7;
		int b=9;
		
		System.out.println(a-b);
		
	}
	public static void main(String[] args) {
		Constructor obj = new Constructor();
	}
}