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
public class test10_1 {
//스캐너와 StringBuilder을 이용하여 문제 풀기
//배열을 이용하지 않고 입력받음과 동시에 if문으로 검사해서
//주어진 수 보다 작은 경우 StringBuilder에 저장해주는 방법
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		//StringBuilder는 String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라
		//기존의 데이터에 더하는 방식을 사용하기 떄문에 속도도 빠르며 상대적으로 부하가 적다.
		//따라서 긴 문자열을 더하는 상황이 발생할 경우 StringBuilder를 적극적으로 사용하면 된다.
		for(int i=0; i<N; i++) {
			int value = sc.nextInt();
			if(value < X) {
				sb.append(value+" ");
				//sb에다가 문자열을 담음
				//append()는 문자열을 더하는 역할, 하나의 문자열로 만들어주는 메소드
			}
		}
		System.out.println(sb.toString());
		//즉 입력받은 문자열을 모두 이어준 뒤 한번만 sb를 출력해주면
		//연결된 문자열이 한번에 출력됨, 시간단축에 매우 이점이 있다.
		//toStirng을 붙이면 0.2초 정도 시간 단축이 더 됨, 안붙여도 상관은 없음
	}

}
