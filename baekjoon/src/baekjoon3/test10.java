package baekjoon3;

import java.util.Scanner;

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
public class test10 {
//스캐너와 배열을 이용해서 문제풀기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//정수 N
		int X = sc.nextInt();
		//정수 X
		int []arr = new int[N];
		//배열 참조변수 선언과 동시에 배열 크기 N개 할당
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			//입력받은 수열 for문에 저장
		}
		sc.close();
		for(int i = 0; i < N; i++) {
			//다시 한 번 반복문으로 배열 검사
			if(arr[i] < X) {
			//조건문에 따라 출력
				System.out.print(arr[i] +" ");
				//오답노트
				//System.out.print : 출력할때 한 줄로 출력
				//System.out.println : 출력할때 다음줄에 이어서 출력
				//'1 4 2 3' 이런 형식으로 출력이 되어야 하기에 print뒤에 ln을 붙이지 않고 써야함.
			}
		}
		
	}

}
