package baekjoon4;

import java.util.Scanner;

//단계별로 풀어보기
//while문
//10951번
//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
//입력
//입력은 여러 개의 테스트 케이스로 이루어져 있다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.(0<A, B<10)
//출력
//각 테스트 케이스마다 A+B를 출력한다.

//주의할 점
//두 정수는 공백으로 나뉘어 구분된다.
//입력의 종료는 더이상 읽을 수 있는 데이터가 없을 때 종료한다.(EOF-End Of File)
//입력만 주어지고 더이상 읽을 수 있는 데이터가 없을 때 종료하는것이 중요!
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//스캐너 소환
		
		//스캐너는 읽을 데이터가 없으면 예외를 던져버리기 때문에 try-catch문 또는
		//스캐너 메소드인 hasNext()를 통해 처리해준다.
		//hasNextInt - boolean형, 정수가 들어오면 true, 아니면 false를 반환
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
		//백준에서는 해결되지만 IDE나 터미널에서는 EOF를 입력(ctrl + z)
		//또는 정수가 아닌 문자열을 입력한다는 등 다른 타입의 입력을 주어
		//예외를 던져주어야 한다.
		
	}
}

