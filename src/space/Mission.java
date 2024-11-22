package space;


public class Mission implements Comparable<Mission>
{
	private String			destination;
	private float			cost;
	
	
	public Mission(String destination, Float cost)
	{
		this.destination = destination;
		this.cost = cost;
	}
	
	
	public String getDestination()
	{
		return destination;
	}
	
	
	public float getCost()
	{
		return cost;
	}


	// Compare by cost, then by destination.
	public int compareTo(Mission that) 
	{ 		
		if (this.getCost()!=that.getCost()){
			if (this.getCost()< that.getCost())
				return -1;
			else
				return 1;
		}
		else{
			return this.getDestination().compareTo(that.getDestination());
		}

	}
	
	
	// Let compareTo() do the work. This method should just be 1 line.
	public boolean equals(Object x)
	{
		return (compareTo((Mission) x)==0);
	}
	
	
	// Return the destination’s hash code.
	public int hashCode()
	{
		return getDestination().hashCode();
		
		
	}
	
	
	public String toString()
	{
		return "Mission to " + destination + " will cost " + cost;
	}
	public static void main(String[] args) {
		Mission a = new Mission("Mars", 3421.3f);
		Mission b = new Mission("Jupiter", 3421.3f);
		Mission c = new Mission("Mars", 3421.3f);
		Mission d = new Mission("Venus", 19483f);

		System.out.println(a.compareTo(b)); 
		System.out.println(a.compareTo(c)); 
		System.out.println(a.compareTo(d)); 
		// System.out.println(a.hashCode());
		// System.out.println(c.hashCode());

		System.out.println(a.equals(c));
		System.out.println(a.equals(d));

		System.out.println(b.hashCode());

	}
}
