
public class testf {
	public static void main(String[] args) {
		card r=new card();
		card k=new card();
		card m=new card();
		r.swipe();
		m.swipe();
		r.swipe();
		k.swipe();
		r.swipe();
		m.swipe();
		
		System.out.println("total count is :"+ card.orgcount);
		
	}

}
