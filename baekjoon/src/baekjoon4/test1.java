package baekjoon4;

import java.util.Scanner;

//단계별로 풀어보기
//while문
//10952번
//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
//입력
//입력은 여러 개의 테스트 케이스로 이루어져 있다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.(0<A, B<10)
//입력의 마지막에는 0 두 개가 들어온다.
//출력
//각 테스트 케이스마다 A+B를 출력한다.
public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//스캐너 소환
		while(true) {
		//while(true)로 무한 루프(무한히 반복한다는 의미)
		//while(조건문) - 조건문이 true이므로 조건문은 항상 참이 된다.
		//조건문이 참인 동안에 while에 속해 있는 문장들을 계속해서 수행함
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==0 && B==0) {
			//만약 A가 0이고 B가 0인게 모두 참일 경우 break를 통해 반복문을 종료해주고
			//아닐 경우 입력받은 A와 B를 더해준다.
			//&&, and 둘 다 같은 의미이지만 연산이 이루어질 때의 우선순위가 다르기 때문
			//&&의 우선순위는 and보다 높으므로 일반적으로 &&만 사용
				break;
			}
			System.out.println(A+B);
		}
		
	}
}
