package baekjoon1;

import java.util.Scanner;

//단계별로 풀어보기
//입출력과 사칙연산
//1000번
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		
//		System.out.println(A + B);
//		처음 블로그 보고 따라하고 입출력값을 직접 디테일하게 보고 싶어 만든 코드임, 2021.12.22
		Scanner sc = new Scanner(System.in);
		System.out.println("A 값 입력");
		int A = sc.nextInt();
		System.out.println("B 값 입력");
		int B = sc.nextInt();
		System.out.println("A 값 = "+A+" B 값 = "+B);
		System.out.println("A + B 는 = "+(A+B));
	}

}
