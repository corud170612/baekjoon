package baekjoon2;

import java.util.Scanner;

//단계별로 풀어보기
//if문
//1330번
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}
		else if(A < B) {
			System.out.println("<");
		}
		else if(A==B) {
			System.out.println("==");
		}
	}

}
