//Write a program to check whether No. is negative or positive 0r zero if the number is positive 
//Also print whether its even or odd 
public class NestedIfEx1 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Number is negative");
		}else if(n==0) {
			System.out.println("Number is Zero");
		}else if(n>0) {
			System.out.println("Number is Positive");
			if(n%2==0) {
				System.out.println("Number is Even.");
			}else {
				System.out.println("Number is Odd.");
			}
		}
		System.out.println("Thank YOu");
	}
}
