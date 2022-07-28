
public class Stringconv {


	
	public static void main(String[] args) {
		String name = new String("peter");
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		
		System.out.println(name.substring(3));
		
		
		StringBuffer sbf = new StringBuffer("goodevening");
		sbf.append(" peter");
		System.out.println(sbf);
		sbf.reverse();
		System.out.println(sbf);
	    sbf.delete(1, 3);
	    System.out.println(sbf);
	    
	    
	    
	    StringBuilder sb = new StringBuilder("stringbuilder");
	    sb.append(" print");
	    System.out.println(sb);
	    sb.reverse();
	    System.out.println(sb);
	    sb.insert(3, "x");
	    System.out.println(sb);
	}
}
