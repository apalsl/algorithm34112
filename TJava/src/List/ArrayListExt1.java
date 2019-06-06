package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExt1 {

	public static void main(String[] args) {
		List list1= new ArrayList<>(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		List list2 = new ArrayList<>(list1.subList(1, 4));
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		
		// list2�� list1�� ��ü�� ���Ե��ִ��� üũ
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
	
		list2.set(3, "AA");
		print(list1, list2);
		
		// list1���� list2�� ��ġ�� �κи� ����� ������ ����
		System.out.println("list1.retainAll(lsit2) : " + list1.retainAll(list2));
		
		print(list1, list2);
		
		
		System.out.println("forEach ����");
		list2.forEach(e -> {
			if (list1.contains(e)) {
//				list2.remove();
				// remove���� ��ü�� �����Ҽ����� ���ڰ� ������ i�� �����ϴµ�...
				// �� ���������� e count�� �˼��� ����...
				// for������ �����ؾ� �Ѵ�.
			}
 		}); 
		print(list1, list2);
		
		System.out.println("for�� ����");
		for(int i= list2.size()-1; i>=0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
		
		print(list1, list2);

	}
	 
	public static void print(List list1, List list2) {
		
	list1.forEach(e -> {
		System.out.println("list1 = " + e);
	});
	
	System.out.println("----------------------------------------");
	
	list2.forEach(e -> {
		System.out.println("list2 = " + e);
	});
	
	System.out.println("======================================");
	
	
		
	}

}
