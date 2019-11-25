
public class TestG {
public static void main(String[] args) {
	
	scientific s=new scientific();
	s.cost=200;
	s.add();
	s.mul();
	s.sin();
	s.tan();
	
	System.out.println("cost is: " +s.cost);
	
	System.out.println("----------------------------");
	calculator cal=new calculator();
	cal.cost=200;
	cal.add();
	cal.mul();
}
}
