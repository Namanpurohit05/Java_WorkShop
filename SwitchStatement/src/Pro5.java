
public class Pro5 {
	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		int n = sc.nextInt();
		
		while(n>0) {
			
			int r=n%10;
			int rev=0;
			rev= rev*10+r;
			
			n= n/10;
			System.out.print(rev);
		}
		sc.close();
	}
}
