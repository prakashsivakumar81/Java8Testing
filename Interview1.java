
public class Interview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abcabxfdgcd");
		String[] strs = new String[500];
		String bigStr = null;
		char[] chars = s.toCharArray();
		int x = 0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length()+1;j++) {
				strs[x++]= s.substring(i, j);	
			}
		}
		for(String s1: strs) {
			System.out.println("s1 --" + s1);
			for(char c : chars) {
				System.out.println("c-- " + c);
				if(s1 != null && s1.indexOf(c)> -1 &&  (s1.indexOf(c) == s1.lastIndexOf(c))) {
					bigStr = bigStr == null ? s1 : bigStr.length() > s1.length() ? bigStr : s1;
					System.out.println("bigstr -- " + bigStr);
				} else if(s1 != null && s1.indexOf(c)> -1 &&  (s1.indexOf(c) != s1.lastIndexOf(c))) {
					continue;
				}
			}
			
		}
		System.out.println(bigStr);
	}

	

}
