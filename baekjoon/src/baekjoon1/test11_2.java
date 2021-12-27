package baekjoon1;

import java.util.Scanner;

//단계별로 풀어보기
//입출력과 사칙연산
//2588번
//블로그 출처 - https://st-lab.tistory.com/20
//풀이 2. B를 나머지와 나눗셈 연산을 통해 각 자릿수를 구하여 쓰는 방법
//숫자를 수학적으로 접근하여 푸는 방법
public class test11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(A*(B%100/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
	}

}
