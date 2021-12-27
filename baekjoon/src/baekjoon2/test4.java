package baekjoon2;

import java.util.Scanner;

//단계별로 풀어보기
//if문
//14681번
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>1) {
			if(y>1)
			System.out.println("1");
			
			if(y<-1)
				System.out.println("4");
		}
		else if(x<-1) {
			if(y>1)
				System.out.println("2");
			if(y<-1)
				System.out.println("3");
		}
	}

}
