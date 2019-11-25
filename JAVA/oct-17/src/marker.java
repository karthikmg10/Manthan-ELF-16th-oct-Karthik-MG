
public class marker extends pen {
	marker()
	{
		this(2);
		System.out.println("print B");
	}
	marker(int x)
	{
		System.out.println("print N");
	}
	marker(double x)
	{
		super(2);
		System.out.println("print I");
	}
}
