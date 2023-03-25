package collectionexample;

import java.util.Comparator;

public class FeesComparator implements Comparator<StudentNew> {

	@Override
	public int compare(StudentNew o1, StudentNew o2) {
		if(o1.fees>o2.fees)
		{
			return 1;
		}
		else if(o1.fees<o2.fees)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
