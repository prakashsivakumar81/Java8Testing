
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Arithmetic {

	public Integer sum(Integer[] ints) {
		int sum = Arrays.stream(ints).mapToInt(Integer::intValue).sum();
		return sum;
	}

	public String sum(String[] strs) {
	      StringBuffer sb = new StringBuffer();
	      for(int i =0;i<strs.length;i++) {
	    	  sb.append(strs[i]);
	      }
	      String s = sb.toString();
	      
	     return s;   
	    }

}

public class Solution {
	public static void main(String[] args) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Arithmetic b = new Arithmetic();
		try{
			int[] ints = new int[args.length];
			
			for (int i = 0; i < args.length; i++) {
			    int neki = Integer.parseInt(args[i]);
			    ints[i] = neki;
			}
			Integer[] boxedArray = Arrays.stream(ints).boxed().toArray(Integer[]::new);
			System.out.println("result" + b.sum(boxedArray));
        }
        catch (NumberFormatException ex){
        	System.out.println("result" + b.sum(args));
        }
	       
	}

}