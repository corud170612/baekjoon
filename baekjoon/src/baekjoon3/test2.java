package baekjoon3;

import java.util.Scanner;

//단계별로 풀어보기
//for문
//10950번
//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//각 테스트 케이스는 한 줄로 이루어져 잇으며, 각 줄에 A와 B가 주어진다.(0<A, B<10)
//출력
//각 테스트 케이스마다 A+B를 출력한다.
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		//int arr[] : 정수형 변수를 담는 공간을 가리키는'주소값'을 여러개 저장하는 공간
		
		for(int i=0;i<T;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			arr[i] = A+B;
		}
		
		for(int k : arr) {
			System.out.println(k);
		}
	}

}
