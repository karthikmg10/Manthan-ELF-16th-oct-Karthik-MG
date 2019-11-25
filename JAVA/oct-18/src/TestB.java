
public class TestB {
	public static void main(String[] args) {
		pen p = new marker();
		p.cost=100;
		p.open();
		p.write();
		p.color();
		p.close();
		System.out.println("cost is "+p.cost);
	}
}
