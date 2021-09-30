
public class Main {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;
		
		n2 += 1;
		n2 += n1;
		n2 += n1 + 10 - 4;
		n2 = n2 + n1 +10 - 4;
		System.out.println(n2);
		
		n1 = 10;
		
		n1 /= 5;
		System.out.println(n1);
		
		n1 *= 5;
		System.out.println(n1);
		
		n1 %= 7;
		System.out.println(n1);
	}
}
