package SuperKeyword2;


public class Dog extends Animal{
	
	void eat()
	{
		System.out.println("Eating chicken .........");
	}
	void barking()
	{
		System.out.println("Barking .........");
	}
	void work()
	{
		Dog d = new Dog();
		d.barking();
		super.eat();
	}

}
