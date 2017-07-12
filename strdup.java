package trycode;
import java.util.*;
public class strdup {
	public static void main(String args[]){
		String str="bbbb";
		Set<Character> s=new LinkedHashSet<Character>();
		for(char c:str.toCharArray()){
			s.add(c);
		}
		System.out.println(s.size());
	}
}
