package baekjoon2;

import java.util.Scanner;

//단계별로 풀어보기
//if문
//2753번
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Y = sc.nextInt();
		
		if(Y%4==0 && Y%100!=0 || Y%400==0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
//		if(Y%4==0) {
//			if(Y%100!=0 || Y%400 == 0) {
//				System.out.println("1");
//			}
//		}
//		else {
//			System.out.println("0");
//		}
	}

}
