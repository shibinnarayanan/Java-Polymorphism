package RuntimePolymorphismEx2;

public class Main {
	
	public static void main(String[] args) {
		
		Bank b;
		
		b = new SBI();
		System.out.println(b.getRateOfInterest());
		b = new UBI();
		System.out.println(b.getRateOfInterest());
	}

}
