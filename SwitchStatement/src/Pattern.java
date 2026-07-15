
public class Pattern {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int n = sc.nextInt();
		for(int b=1;b<=n;b++) {
			for(int a=n;a<=b;a--) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
