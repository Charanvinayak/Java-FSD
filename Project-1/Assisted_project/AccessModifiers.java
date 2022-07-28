///default


/*public class AccessModifiers {

	
	void display() {
		System.out.println("My name is Peter");
		}
	
	public static void main(String[] args) {
		AccessModifiers def = new AccessModifiers();
		def.display();
	}
}

*/

//public

/*public class AccessModifiers {
     
	 String S;
	 
	
	public void display() {
		
		 S = "Peter";
		System.out.println("My name is "+S);
		 		
		
		}
	public static void main(String[] args) {
		AccessModifiers pub = new AccessModifiers();
		pub.display();
	}
	
}
*/




//private

/*
public class AccessModifiers{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		AccessModifiers prv = new AccessModifiers();
		prv.setName("logesh");
	    System.out.println(prv.getName());
	    prv.setAge(21);
	    System.out.println(prv.getAge());
		
	}
	
}
*/

//protected



class AccessModifiers {
    // protected method
    protected void display() {
        System.out.println("I am Peter");
    }
}

class Logesh extends AccessModifiers {
    public static void main(String[] args) {

        // create an object of Dog class
        Logesh log = new Logesh();
         // access protected method
        log.display();
    }
}

