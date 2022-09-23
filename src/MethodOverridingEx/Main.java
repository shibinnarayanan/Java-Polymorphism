

package MethodOverridingEx;

public class Main {
	
	public static void main(String[] args) {
		
		
		SBI S = new SBI();
		UBI U = new UBI();
		System.out.println(S.getInterest());
		System.out.println(U.getInterest());
	}

}
