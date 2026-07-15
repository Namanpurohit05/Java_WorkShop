
public class ifEx1 {
	public static void main(String []args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		
		System.out.println("Enter your age:");
		int age= sc.nextInt();
		if( age <= 19 && age >= 13 ) {
		System.out.println("You're Teenager");
		}else{
			System.out.println("You're Not a Teeanger");
		}
		System.out.println("Thank You");
	}
}
