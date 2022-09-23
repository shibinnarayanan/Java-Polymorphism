package MethodOverloading;

public class ByChangingNumberOfArgs {
	
	public void add(int a,int b)
	{
		System.out.println("Result - "+a+b);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println("Result - "+a+b+c);
	}
	
	public static void main(String[] args) {
		
		ByChangingNumberOfArgs test = new ByChangingNumberOfArgs();
		test.add(1,2);
		test.add(1,2,3);
	}

}
