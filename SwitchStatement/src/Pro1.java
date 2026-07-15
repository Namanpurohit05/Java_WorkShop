
public class Pro1 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Two number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter the Opertaion: ");
		char ch = sc.next().charAt(0);
		switch(ch){
		case '+':
			System.out.println("Sum of two number is: "+(num1+num2));
			break;
		
		case '-':
			System.out.println("Subtract of two number is: "+(num1-num2));
			break;
		
		case '*':
			System.out.println("Multiplication of two number is: "+(num1*num2));
			break;
			
		case '/':
			System.err.println("Division of two number is: "+(num1/num2));
			break;
			
		case '%':
			System.out.println("Modulus of two number is: "+(num1%num2));
			break;
			
		default :
			System.out.println("Invalid Operation!!");
		}
		
	}
}
