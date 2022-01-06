package baekjoon3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//단계별로 풀어보기
//for문
//2438번
//문제
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//입력
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//출력
//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
public class test9_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		//반복문,알고리즘
		//먼저 N이라는 숫자가 주어짐, 1부터 N행까지 출력을 하기 위한 가장 큰 틀의 반복문 구상
		for(int i=1;i<=N;i++) {
			//i는 행을 의미함
			//i의 값만큼 출력시켜주기 위한 for문 작성
			//j는 *개수
			for(int j=1;j<=i;j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
