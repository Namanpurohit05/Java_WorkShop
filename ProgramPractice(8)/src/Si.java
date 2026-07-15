/**Q= Write a program to calculate simple interest and all the value given by user**/
public class Si {
		public static void main(String []args) {
			java.util.Scanner sc= new java.util.Scanner(System.in);
			System.out.println("Please Enter the time:");// per year
			int t=sc.nextInt();
			System.out.println("Please Enter the Principal:");//initial Amount
			int p=sc.nextInt();
			System.out.println("Please Enter the Rate:");//Rate of interest per year
			int r=sc.nextInt();
			int si;
			si=(p*r*t)/100;
			System.out.println("Simple interest is: "+si);
		}
}
