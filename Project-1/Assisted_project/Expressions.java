import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expressions {
public static void main(String[] args) {
	Pattern pattern = Pattern.compile("College", Pattern.COMMENTS);
	Matcher match = pattern.matcher("I did my College well");
	boolean matchFound = match.find();
	Matcher match1 = pattern.matcher("I did my //College well");
	boolean matchFound1 = match1.find();
	
	if (matchFound)
	{System.out.println("Match found");
	
}else {
	System.out.println("match not found");
}
	
	if(matchFound1)
	{
		System.out.println("match found");
	}
	else
	{System.out.println("match not found");
	}
	
}
}
