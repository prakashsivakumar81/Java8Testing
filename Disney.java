
public class Disney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "khae asjhaskjaskjh jkashdjhjas njasdjhjjas jhjasljhdas jhjasjkdjdsa hello world how are you all";
		double d  = averageWordLength(s);
		System.out.println("average word length = " + d);
	}

	private static double averageWordLength(String s) {
		// TODO Auto-generated method stub
		String[] strs = s.split(" ");
		int length = 0;
		for(String str: strs) {
			length = length + str.length();
		}
		return length/strs.length;
	}

}
