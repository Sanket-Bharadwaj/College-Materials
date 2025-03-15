package q02;

public class User implements Comparable <User>
{
  private String name;
  private int age;
  User(String name, int age) {
	this.name = name;
	this.age = age;
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

@Override
 public String toString()
  {
	  return("Name: "+getName()+"\nAge: "+getAge());
  }
@Override
public int compareTo(User e) {
	if (this.getAge()>e.getAge())
		return 1;
	else if (this.getAge()<e.getAge())
		return -1;
	else
		return 0;
}
}
