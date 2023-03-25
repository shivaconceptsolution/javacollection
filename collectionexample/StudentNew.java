package collectionexample;

public class StudentNew  {
   int rno;
   String name;
  int fees;
  public StudentNew(int rno,String name,int fees)
  {
	  this.rno=rno;
	  this.name=name;
	  this.fees=fees;
  }
  public String toString()
  {
	  return "rno is "+rno + " name is "+name + " fees is "+fees;
  }
 
}
