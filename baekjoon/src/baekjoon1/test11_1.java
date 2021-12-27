package baekjoon1;

import java.util.Scanner;

//단계별로 풀어보기
//입출력과 사칙연산
//2588번
//블로그 출처 - https://st-lab.tistory.com/20
//풀이 1. B를 문자열로 입력받아 chartAt()으로 하나씩 꺼내 쓰는 방법
public class test11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		String B = sc.next();
		
		System.out.println(A*(B.charAt(2) - '0'));
		System.out.println(A*(B.charAt(1) - '0'));
		System.out.println(A*(B.charAt(0) - '0'));
		System.out.println(A*Integer.parseInt(B));
	}

}
