//Method Implementation

/*
public class Methodcall {
int a;
int b;

public int add(int a, int b) {
	int c = a+b;
	return c;
	
}
	
public static void main(String[] args) {
	Methodcall sum = new Methodcall();
	int ans = sum.add(5, 7);
	System.out.println("The answer is "+ans);
}
	
}
*/

//Call by value
/*public class Methodcall{
	int a = 5;
	
	
	
	public int add(int a) {
		
		 a = a*10/100;
		return a;
	}
	public static void main(String[] args) {
		Methodcall sum = new Methodcall();
		sum.add(150);
		System.out.println(sum.a);
	}
}*/



//method overloading
class Methodcall {
	
	int a,b;
    public void display(int a){
        System.out.println("Arguments: " + a);
    }

 public void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
    	Methodcall obj = new Methodcall();
        obj.display(1);
        obj.display(1, 4);
    }
}