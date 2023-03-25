package collectionexample;

public class Student implements Comparable<Student> {
  private int rno;
  private String name;
  private int fees;
  public Student(int rno,String name,int fees)
  {
	  this.rno=rno;
	  this.name=name;
	  this.fees=fees;
  }
  public String toString()
  {
	  return "rno is "+rno + " name is "+name + " fees is "+fees;
  }
 @Override
 public int compareTo(Student o) {
	if(o.rno>rno)
	{
		return 1;
	}
	else if(o.rno<rno)
	{
		return -1;
	}
	else
	{
		return 0;
	}
 }
}
