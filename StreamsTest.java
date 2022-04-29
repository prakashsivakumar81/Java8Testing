import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(0,10,20,23,12,45,87,8,7));
		System.out.println(System.currentTimeMillis());
		List<Integer> l2 = l1.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(System.currentTimeMillis());
		System.out.println(l2);
		System.out.println(System.currentTimeMillis());
		List<Integer> l3 = new ArrayList<Integer>();
		for(Integer i:l1) {
			if(i%2==0) {
				l3.add(i);
			}
		}
		System.out.println(System.currentTimeMillis());
		System.out.println(l3);
		List<Integer> l4 = l1.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(l4);
		Integer i11 = l1.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(i11);
		int[] nums = {10,4,5,6,7,7,3};
		
	}

}
