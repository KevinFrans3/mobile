
public class Branch {

	public int length;

	public Structure struct;

	public Branch(int l, Structure s)
	{
		length = l;
		struct = s;
	}

	public int getLength()
	{
		return length;
	}

	public Structure getStructure()
	{
		return struct;
	}

	public int getTorque()
	{	
		return struct.getWeight() * length;
	}



}
