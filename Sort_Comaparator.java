import java.util.*;
class Name
{
	String fname;
	String lname;
	int roll;
    public Name(int roll,String fname, String lname)
	{
    	this.roll=roll;
		this.fname  = fname;
		this.lname = lname;
	}

	public String toString()
	{
		return this.roll+" "+this.fname + " " + this.lname;
	}
}

class Sortbylname implements Comparator<Name>
{
	public int compare(Name a, Name b)
	{
		if(!(a.lname.equals(b.lname)))
		return a.lname.compareTo(b.lname);
		else
			return a.fname.compareTo(b.fname);
	}
}
class Sortbyfname implements Comparator<Name>
{
	public int compare(Name a, Name b)
	{
		if(!(a.fname.equals(b.fname)))
		return a.fname.compareTo(b.fname);
		else
			return a.lname.compareTo(b.lname);
	}
}
class SortbyRoll implements Comparator<Name>
{
	public int compare(Name a, Name b)
	{
		return a.roll-b.roll;
	}
}

class Sort_Comaparator
{
	public static void main (String[] args)
	{
		ArrayList<Name> ar = new ArrayList<Name>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
		    String s=sc.next();
		    String s1=sc.next();
		    ar.add(new Name(x,s,s1));
		}

		Collections.sort(ar, new Sortbyfname());
		System.out.println("\n---->Sorted by First name<----");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar, new Sortbylname());
		System.out.println("\n---->Sorted by last name<----");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar, new SortbyRoll());
		System.out.println("\n---->Sorted by Roll No.<----");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));
	}
}
