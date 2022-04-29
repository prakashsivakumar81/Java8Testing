import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0);
		l1.add(5);
		l1.add(6);
		l1.add(44);
		l1.add(56);
		l1.add(34);
		l1.add(12);
		l1.add(21);
		for(Integer i: l1) {
			l1.remove(5); //ConcurrentModificationException
		}
		List<Integer> l2 = Arrays.asList(1,4,6,3,33,65,42,23,455);
		Iterator i = l2.iterator();
		while(i.hasNext()) {
			l2.remove(4);//UnsupportedOperationException
		}

	}

}
