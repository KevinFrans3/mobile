
public class Branch {

	public int length;

	public boolean isWeight = false;
	public int weight;
	public Mobile mobile;

	public Branch(int l, int w)
	{
		length = l;
		weight = w;
		isWeight = true;
	}

	public Branch(int l, Mobile m)
	{
		length = l;
		mobile = m;
		isWeight = false;
	}

	public int getLength()
	{
		return length;
	}

	public boolean getIsWeight()
	{
		return isWeight;
	}

	public int getWeight()
	{
		return weight;
	}

	public Mobile getMobile()
	{
		return mobile;
	}



}
