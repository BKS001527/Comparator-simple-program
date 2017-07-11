import java.util.*;
class Student
{
	String name;
	int m1,m2,m3,total;
	public Student(String name,int m1,int m2,int m3,int total)
	{
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.total=total;
	}
	public String toString()
	{
		return name;
	}
}
class Sort_By_Mark implements Comparator<Student>{
	public int compare(Student t,Student t1)
	{
		int res=0;
		if(t.total==t1.total)
			{if(t.m1==t1.m1)
				{if(t.m2==t1.m2)
					{res= t.m3-t1.m3;}}}
		else if(t.total==t1.total)
		{
			if(t.m1==t1.m1)
				res= t.m2-t.m2;
		}
		else if(t.total==t1.total)
		{
			res= t.m1 - t1.m1;
		
		}
		else
			res= t.total-t1.total;
		return res;

}}
public class Sort_By_Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> a=new ArrayList<Student>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			int m1=sc.nextInt();
			int m2=sc.nextInt();
			int m3=sc.nextInt();
			int total=m1+m2+m3;
			a.add(new Student(s,m1,m2,m3,total));
		}
		Collections.sort(a,new Sort_By_Mark());
		for(Student q:a)
			System.out.println(q);

	}

}
