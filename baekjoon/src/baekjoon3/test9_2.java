package baekjoon3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//단계별로 풀어보기
//for문
//2439번
//문제
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//입력
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//출력
//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
public class test9_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		//반복문,알고리즘
		//먼저 N이라는 숫자가 주어짐, 1부터 N행까지 출력을 하기 위한 가장 큰 틀의 반복문 구상		
		for(int i=1;i<=N;i++) {
			//i는 행을 의미함
			//공백이 1행에 4개출력, 2행에 3개출력...
			//즉, n번쨰 행에 N-n개의 공백 출력, n개의 별 출력
			//i는 행을 의미하니, N-i값 만큼 공백 출력
			for(int j=1;j<=N-i;j++) {
				bw.write(" ");
			}
			//각 행에 별도 출력 해주어야 하니 i값만큼 for문을 외부에 하나 더 작성
			for(int k=1;k<=i;k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
