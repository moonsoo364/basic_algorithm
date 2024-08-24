package recursion;

import java.util.Scanner;

public class EuclidGCD {
//	유클리드 호재법: 두 수의 최대 공약수(Greateset Common Divisor)를 구하는 알고리즘 
//	최대 공약수: 두 수가 가지고 있는 약수중 가장 큰 수
//	22의 약수 22,11,2,1
//	8의 약수 8,4,2,1
//	22와 8의 최대 공약수 = 2
	static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}else {
			return gcd(y, x % y);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 정수의 최대 공약수를 구합니다.");
		
		System.out.println("정수를 입력하세요.");
		int x = stdIn.nextInt();
		System.out.println("정수를 입력하세요.");
		int y = stdIn.nextInt();
		
		System.out.println("최대 공약수 는"+gcd(x,y)+"입니다.");
	}
}
