package baekjoon2;

import java.util.Scanner;

//단계별로 풀어보기
//if문
//2884번
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M<45) {//사용자가 입력한 분이 45분이 되지 않았다면 입력받은 시에서 -1을 해주어야 함
			H--;//H-- : 'H값을 먼저 사용한 수 1감소' 라는 증감연산자 종류
			M = 60 - (45 - M);//분은 60분으로 이루어져 있으니까 60 - (45 - M)을 하면 정확한 값이 나옴
							  //ex) 60 - (45 - 10) = 60-35=25
			if(H<0)//사용자가 24시간 기준으로 입력했다면 같은 원리로 -1을 해주어야하는데
				H=23;//24시는 00으로 표현되기 때문에 0전에 23시로 가도록 고정 
			System.out.println(H + " " + M);
		}
		else {//사용자가 입력한 분이 45분이 넘는다면 그냥 입력받은 분에서 -45만 해주면 됨
			System.out.println(H + " " +(M-45));
		}
	}

}
