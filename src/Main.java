// William Park and Kevin Frans
public class Main {

	public static void main(String[] args) {
		//kek
		
		Branch a = new Branch(2, new Weight(2));
		Branch b = new Branch(2, new Weight(2));
		Mobile ab = new Mobile(a,b);
		Branch abd = new Branch(2,ab);
		Branch c = new Branch(4,new Weight(2));
		Mobile total = new Mobile(abd,c);
		
		
		System.out.println(total.getWeight());
		System.out.println(total.isBalanced());
		
		
		
	}

}
