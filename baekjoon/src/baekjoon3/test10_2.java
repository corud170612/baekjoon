package baekjoon3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//단계별로 풀어보기
//for문
//10871번
//문제
//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//입력
//첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//출력
//X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
//10 5
//1 10 4 9 2 3 8 5 7 6
public class test10_2 {
//BufferedReader로 입력받고 문자열을 분리해주어야 하니 StringTokernizer를 사용
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		//br.readLine()으로 한 줄을 문자열로 읽어들인 뒤 ""<-공백을 기준으로 분리하겠다는 의미
		//문제에서는 두 줄을 입력받기 때문에 StringTokernizer를 두번 사용함
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
				
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<N; i++) {
			
			int A = Integer.parseInt(st.nextToken());
			if(A < X)
				sb.append(A).append(' ');
		}
		System.out.println(sb);
	}

}
