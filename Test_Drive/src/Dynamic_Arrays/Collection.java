package Dynamic_Arrays;

import java.util.*;
public class Collection
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(7);
		list.add(5);
		System.out.println(list);
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		System.out.println(Collections.frequency(list, 2));
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		List<Student> stud = new ArrayList<Student>();
		
		stud.add(new Student("Sourav", 1));
		stud.add(new Student("Mithilesh", 3));
		stud.add(new Student("Suraj", 2));
		stud.add(new Student("Secudir", 4));
		
		
		System.out.println(stud);
		Collections.sort(stud);
		System.out.println(stud);
	}
}

/*
	[4, 3, 2, 6, 7, 5]
	2
	7
	1
	[2, 3, 4, 5, 6, 7]
	[7, 6, 5, 4, 3, 2]
	[Student{name = 'Sourav', roll no = 1}, Student{name = 'Mithilesh', roll no = 3}, Student{name = 'Suraj', roll no = 2}, Student{name = 'Secudir', roll no = 4}]
	[Student{name = 'Sourav', roll no = 1}, Student{name = 'Suraj', roll no = 2}, Student{name = 'Mithilesh', roll no = 3}, Student{name = 'Secudir', roll no = 4}]
*/
