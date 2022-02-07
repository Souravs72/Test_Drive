package Dynamic_Arrays;

import java.util.*;
public class StudentHashSet
{
	public static void main(String[] args)
	{
		Set<Student> stud = new HashSet<>();
		
		
		stud.add(new Student("Sourav Singh", 1));
		stud.add(new Student("Suraj Gupta", 2));
		stud.add(new Student("Mithilesh PD", 3));
		stud.add(new Student("Secudir Singh", 4));
		
		
		System.out.println(stud);
		
		stud.add(new Student("Secudir Singh", 4));
		System.out.println(stud);
		
	}
}
