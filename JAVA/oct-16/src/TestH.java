
public class TestH {
	public static void main(String[] args) {

		System.out.println("--------- third gen mobile -----------");
		thirdgen t=new thirdgen();
		t.call();
		t.mesg();
		t.radio();
		t.camera();
		System.out.println("---------------------------------------");
		
		System.out.println("--------- second gen mobile -----------");
		secondgen s=new secondgen();
		s.call();
		s.mesg();
		s.radio();
		System.out.println("---------------------------------------");
		
		System.out.println("--------- first gen mobile -----------");
		firstgen f=new firstgen();
		f.call();
		f.mesg();
		System.out.println("---------------------------------------");
	}
}
