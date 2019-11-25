
public class TestB {
	public static void main(String[] args) {
		Van v=new Van();
		v.cost=200;
		v.model="maruthi";
		v.move();
		v.stop();
		System.out.println("cost is "+v.cost);
		System.out.println("model is "+v.model);
	}

}
