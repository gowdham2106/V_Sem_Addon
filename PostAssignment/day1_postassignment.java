package addon_dsa;

import java.util.Scanner;

public class day1_postassignment {
	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.println("enter a number");
		int num=a.nextInt();
		System.out.println(SumOfDigit(num));
	}
public static int SumOfDigit(int num) {
	if (num==0) {
		return 0;
	}
	return (num % 10 + SumOfDigit(num / 10));
}

}
