
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	int n = s.nextInt();
	while(n!=0){
	    String p = s.next();
	    String s1 []= p.split("\\.");
	    for(int i=s1.length-1;i>0;i--){
	        System.out.print(s1[i]+".");
	    }
	    System.out.print(s1[0]);
	    System.out.println();
	    
	    
	    
	    
	    n--;
	    
	}
	
	
	}
}
