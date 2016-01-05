
public class Mobile implements Structure{

//William Park and Kevin Frans


	Branch left;
	Branch right;

	public int getWeight()
	{

		return left.struct.getWeight() + right.struct.getWeight();

	}
	


	public Mobile(Branch l, Branch r)
	{
		left = l;
		right = r;
	}
	
	public boolean isBalanced()
	{
		if(left.getTorque() == right.getTorque())
		{
			if(left.struct.isBalanced())
			{
				if(right.struct.isBalanced())
				{
					return true;
				}
			}
		}
		
		return false;
	}

	public Branch getLeft()
	{
		return left;
	}

	public Branch getRight()
	{
		return right;
	}



}
