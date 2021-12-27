package baekjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//import java.util.Scanner;

//단계별로 풀어보기
//입출력과 사칙연산
//1000번
public class test5_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		
//		System.out.println(A + B);
//		처음 블로그 보고 따라하고 입출력값을 직접 디테일하게 보고 싶어 만든 코드임, 2021.12.22
//		Scanner sc = new Scanner(System.in);
//		System.out.println("A 값 입력");
//		int A = sc.nextInt();
//		System.out.println("B 값 입력");
//		int B = sc.nextInt();
//		System.out.println("A 값 = "+A+" B 값 = "+B);
//		System.out.println("A + B 는 = "+(A+B));
		
		//블로그를 보고 Bufferreader로도 사용해보고 싶어서 만듬.2021.12.27
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();//br.readLine() 빨간줄이 생겨 예외처리해줌
		StringTokenizer st = new StringTokenizer(str," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(A+B);
		//버퍼 입출력
		//버퍼(buffer) - 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역
		//입출력 속도 향상을 위해 버퍼 사용
	}

}
