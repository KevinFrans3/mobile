
public class Mobile {

	Branch left;
	Branch right;

	public int totalWeight()
	{
		int leftWeight;
		int rightWeight;

		if(left.isWeight)
		{
			leftWeight = left.getWeight();
		}
		else
		{
			leftWeight = left.getMobile().totalWeight();
		}

		if(right.isWeight)
		{
			rightWeight = right.getWeight();
		}
		else
		{
			rightWeight = right.getMobile().totalWeight();
		}

		return leftWeight + rightWeight;

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
			boolean balanced = true;
			if(!left.getIsWeight())
			{
				if(!left.getMobile().isBalanced())
				{
					return false;
				}
			}
			if(!right.getIsWeight())
			{
				if(!right.getMobile().isBalanced())
				{
					return false;
				}
			}
		}
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
