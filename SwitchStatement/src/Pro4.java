
public class Pro4 {
	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		while(n>0) {
			System.out.println("Decrement");
			sum += (n%10);
			
			n= n/10;
			System.out.println(n);
			System.out.println("Sum="+sum);
			
		}
		sc.close();
	}
}
