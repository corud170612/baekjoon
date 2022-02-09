package baekjoon4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
public class test2_1 {
	public static void main(String[] args) throws IOException {
		//BufferedReader 소환
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//BufferedReader의 경우 null을 반환
		//null인지 아닌지만 조건문을 통해 구분해주면 된다.
		//BufferedReader로 null을 반환하기 위해서는 역시 EOF를 던져주어야 하기 때문에
		//마지막에 꼭 ctrl + z를 입력해주어햐 함
		
		//readLine을 통해 입력받아 연산하는 방법을 사용할것임
		//한 행을 전부 읽기 때문에 공백단위로 분리해주어야 함
		//그래서 StringTokernizer를 사용할것임
		String str;
		while((str=br.readLine())!= null) {
			StringTokenizer st = new StringTokenizer(str, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			System.out.println(A+B);
		}
				
	}
}

