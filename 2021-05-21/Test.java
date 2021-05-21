package Test;

import java.util.Scanner;

public class Test {
	//데이터를 저장하고 관리하는 프로그램
	//문자열 비교는 ==로 하지 않는다.
	//문자열 비교는 이렇게 한다 "문자열1".equals("문자열2")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		if(str.equals("aaa")) {
			System.out.println("당신이 입력한 문자는 aaa입니다");
		}else if(str.equals("bbb")) {
			System.out.println("당신이 입력한 문자는 bbb입니다");
		}
		
	}
	// 2. 변수의 생명, 스코프, 영역, 범위가진다
	// 안쪽 지역에서 바깥지역 접근가능, 반대는 불가능, 서로 다른 지역도 접근 불가능
	// { } -> 지역, 구역, 영역
}
//입력값에 help를 입력하면 아래처럼 나오게 해주세요.
//명령어를 입력해주세요: 는 exit를 치기 전까지 계속 나와야 합니다.

/*
(입출력 예시)

명령어를 입력해주세요: help (입력)

add : 데이터 추가
read : 데이터 조회
update : 데이터 수정
delete : 데이터 삭제
exit : 프로그램 종료

명령어를 입력해주세요: (입력)
*/
//자동 임포트 -> ctrl + shift(left) + o