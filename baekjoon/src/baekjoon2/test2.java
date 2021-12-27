package baekjoon2;

import java.util.Scanner;

//단계별로 풀어보기
//if문
//9498번
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		if(X>=90) {
			System.out.println("A");
		}
		else if(X>=80) {
			System.out.println("B");
		}
		else if(X>=70) {
			System.out.println("C");
		}
		else if(X>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
