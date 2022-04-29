import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class HackerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzBuzz(25);
	}

	private static void fizzBuzz(int n) {
		IntPredicate p1 = a -> (a % 3 == 0 && a % 5 == 0);
		IntPredicate p2 = a -> (a %3 == 0 && a % 5 != 0);
		IntPredicate p3 = a -> (a % 3 != 0 && a % 5 == 0);
		Predicate<Integer> p11 = a -> (a % 3 == 0 && a % 5 == 0);
		Predicate<Integer> p22 = a -> (a %3 == 0 && a % 5 != 0);
		Predicate<Integer> p33 = a -> (a % 3 != 0 && a % 5 == 0);
		System.out.println(System.currentTimeMillis());
		for(int i = 1; i<= n; i++) {
			String s = p1.test(i) ? "FizzBuzz" : p2.test(i) ? "Fizz" : p3.test(i) ? "Buzz" : Integer.toString(i);
			System.out.println(s);
		}
		System.out.println(System.currentTimeMillis());
		for(int i = 1; i<= n; i++) {
			String s = p11.test(i) ? "FizzBuzz" : p22.test(i) ? "Fizz" : p33.test(i) ? "Buzz" : Integer.toString(i);
			System.out.println(s);
		}
		System.out.println(System.currentTimeMillis());
	}

}
