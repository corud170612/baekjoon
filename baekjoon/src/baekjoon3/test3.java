package baekjoon3;

import java.util.Scanner;

//단계별로 풀어보기
//for문
//8393번
//문제
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//입력
//첫째 줄에 n(1<=n<=10,000)이 주어진다.
//출력
//1부터 n까지 합을 출력한다.
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;//합계를 넣을 변수 정의 후, 변수 초기화
		for(int i=1;i<=n;i++) {
			sum += i;//sum=sum+i의 줄임말
			//sum은 sum에 i를 더한 값을 대입한다.
		}
		System.out.println(sum);
	}

}
