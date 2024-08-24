package recursion;

import java.util.Scanner;

public class Factorial {
	// 팩토리얼: 주어진 양의 정수 n에 대하여 1부터 n까지 모든 정수를 곱한 값
	// n! = n * (n-1) ... * 2 * 1
	// 0! 은 특별한 경우로 0! = 1로 정의된다.
	// 1! = 1 이다.
	// n! = n * (n - 1)! 이다.
	
	static int factorial(int n) {
		if(n > 0) {
			return n * factorial(n - 1);
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Input integer :");
		int x = stdIn.nextInt();
		
		System.out.println(x + " factorial is "+factorial(x));
	}

}
