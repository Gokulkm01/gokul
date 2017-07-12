package trycode;
import java.util.*;
import java.util.Arrays;
public class arrdec {
public static void main(String args[]){
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(31);
	al.add(14);
	al.add(15);
	al.add(7);
	al.add(2);
	Collections.sort(al);
	Collections.reverse(al);
	//System.out.println(al);   
	Iterator<Integer> itr=al.iterator();
	while(itr.hasNext()){
		Object it=itr.next();
		System.out.println(it);
	}
}
}
