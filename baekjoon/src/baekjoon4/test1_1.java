package baekjoon4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
public class test1_1 {
	public static void main(String[] args) throws IOException {
		//스캐너는 시간이 많이 걸리니 다른 입력방식인 BufferedReader를 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader.readLine()은 문자열 한 줄을 한번에 입력받기 때문에 공백까지 입력이 된다.
		//공백을 기준으로 문자열을 분리해주기 위해 StringTokernizer로 분리해 저장하면서 꺼내오기를 사용
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			//st.nextToken은 문자열을 반환하니 Integer.parseInt로 int형으로 변환시켜줘야함
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) {
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
		
	}
}
