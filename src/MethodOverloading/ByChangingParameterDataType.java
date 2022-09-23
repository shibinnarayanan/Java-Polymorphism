package MethodOverloading;

public class ByChangingParameterDataType {
	
	public void add(int a,int b)
	{
		System.out.println("Result - "+a+b);
	}
	
	public void add(int a,double b)
	{
		System.out.println("Result - "+a+b);
	}
	
	public static void main(String[] args) {
		
		ByChangingParameterDataType test = new ByChangingParameterDataType();
		test.add(1,2);
		test.add(4,8.8);
	}

}
