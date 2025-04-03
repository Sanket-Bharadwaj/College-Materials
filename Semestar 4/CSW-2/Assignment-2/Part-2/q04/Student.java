package q04;

public class Student 
{
	private String name;
	 private int age, mark;
	 
 public Student(String name, int age, int mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getMark() {
	return mark;
}

public void setMark(int mark) {
	this.mark = mark;
}
@Override
public boolean equals(Object o)
{
	Student s1 = (Student) o;
	if (this.name.equals(s1.name))
	{
		return true;
	}
	return false;
}
}
