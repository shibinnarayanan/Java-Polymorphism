package CompiletimePolymorphismEx1;

/*Compile time polymorphism example*/

//Polymorphism resolved during complie time is known as compile time polymorphism
//Method overloading is the example of compile time polymorphism

public class Add {
	
	void add(int a ,int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a ,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		Add a = new Add();
		a.add(3, 4);
		a.add(4, 5, 6);
	}

}
