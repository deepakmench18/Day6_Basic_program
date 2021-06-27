import java.util.Scanner;
public class SquareRoot {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter C value :");
		int c = sc.nextInt();
		int t = c;
		double epsilon = 1E-15;
		while((Math.abs(t - (c/t))) > epsilon * t)
		{
			t = (((c/t) + t) / 2);
		}
		System.out.println(t);

	}

}
