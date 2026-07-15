
public class Pro2 {
	public static void main(String[] args) {
		int sum=0;
		for(int a=1;a<=5;a++) {
			System.out.print(a);
			if(a<5) {
				System.out.print("+");
			}
			sum+=a;
		}
		System.out.println("="+sum);
	}
}
