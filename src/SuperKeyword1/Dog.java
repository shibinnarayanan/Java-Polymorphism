package SuperKeyword1;

/*super is used to refer immediate parent class instance variable.*/

/*We can use super keyword to access the data member or field of parent class. 
It is used if parent class and child class have same fields.*/

public class Dog extends Animal{
	
	public String Color = "Black"; 
	
	void printColor()
	{
		System.out.println(Color);
		System.out.println(super.color);
	}

}
