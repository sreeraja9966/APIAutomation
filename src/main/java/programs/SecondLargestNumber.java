package programs;

import java.util.Arrays;

public final class SecondLargestNumber {
public static void main(String[] args) {
	Integer[] i= {1,10,4,7,8,9};
secondNumber(i);
deleteDuplicatesInString("seleniummlni");
}

public static void secondNumber(Integer[] i) {
//	System.out.println(i.length);
	
	Arrays.sort(i);
System.out.println(i[i.length-2]);	
}

public static void deleteDuplicatesInString(String s) {
	char c;
	String req="";
	for(int i=0;i<s.length();i++) {
		c=s.charAt(i);
			/*
			 * if(req==null ) { req=c+""; }
			 */
		if( !req.contains(c+"") )
		req=req+c;
	}
	
	System.out.println(req);
}
}
