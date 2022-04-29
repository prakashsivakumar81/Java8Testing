public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		for(int i=0;i<n;i++) {
			System.out.println(i%7==0&&i%5==0?"FizzBuzz":i%5==0?"Fuzz":i%7==0?"Buzz":i);
		}
		
	}

}
