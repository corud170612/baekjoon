package baekjoon3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//단계별로 풀어보기
//for문
//15552번
//문제
//Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
//BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
//입력
//첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
//다음 T줄에는 각각 두 정수 A와 B가 주어진다.
//A와 B는 1 이상, 1,000 이하이다.
//출력
//각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
public class test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//Scanner 와 System.out.println 대신 사용할 수 있다.
		int N = Integer.parseInt(br.readLine());
		//readLine()을 사용하면 데이터를 라인 단위로 읽을 수 있음
		//readLine 함수의 리턴 값은 String으로 고정되기 때문에 형변환을 반드시 해줘야함
		StringTokenizer st;//문자열을 토큰화한다.
		//메서드를 읽어들일때 라인 단위로 읽어들일 수 밖에 없음, 스페이스 기준으로 문자열을 분리하는 등 특정 문자에 따라 문자열을 나누고 싶을 때 사용
		//토큰 : 분리된 문자열 조각
		//StringTokenizer 클래스는 하나의 문자열을 여러 개의 토큰으로 분리하는 클래스
		for(int i=0; i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			//테스트 케이스에서 주어지는 두 정수는 문자열 분리를 위해 매 반복마다 StringTokenizer을 생성과 동시에 문자를 입력받는다.
			//StringTokenizer st = new StringTokenizer(문자열, 구분자);
			//구분자를 기준으로 문자열을 분리
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}	//반환되는 타입은 String 이므로 Integer.parseInt를 통해 int형으로 바꿔줌
			//두 토큰을 더해 bw.wrtie에 넣어준다.
			//bw.write 출력
			//System.out.println 처럼 함수가 문자열출력과 개행을 동시에 해주지 않기 때문에
			//개행을 하려면 write에 "\n"을 넣어주거나 New Line함수를 사용해야 한다.
		br.close();
		
		bw.flush();
		//남아 있는 데이터를 모두 출력
		//버퍼를 비운다.
		//거의 필수적임
		bw.close();
		//닫아주기
	}

}
