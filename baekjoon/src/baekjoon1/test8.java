package baekjoon1;

import java.util.Scanner;

//단계별로 풀어보기
//입출력과 사칙연산
//1008번
public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		// 해당문제는 소수점까지 나타내야하는 문제이기에 Int가 아닌 Double형을 사용하였다.
		double B = sc.nextDouble();
		System.out.println(A/B);
		
		
	}

}
