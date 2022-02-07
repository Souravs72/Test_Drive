package Dynamic_Arrays;

public class Student
{
	String name;
	int roll_no;
	public Student(String name, int roll_no) 
	{
		this.name = name;
		this.roll_no = roll_no;
	}
	@Override
	public String toString()
	{
		return "Student{" + "name = '" +name+'\'' +", roll no = " +roll_no +'}';
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + roll_no;
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (roll_no == other.roll_no)
			return true;
		return true;
	}
}
