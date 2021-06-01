package first;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ids = new ArrayList<Integer>();
		ArrayList<String> titles = new ArrayList<String>();
		ArrayList<String> bodies = new ArrayList<String>();
		int articleId=1; //게시물 번호

		while (true) {
			System.out.println("명령어를 입력해주세요 :");
			String command = sc.nextLine();

			if (command.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (command.equals("help")) {
				System.out.println("========================");
				System.out.println("help : 도움말");
				System.out.println("add : 데이터 추가");
				System.out.println("read : 데이터 조회");
				System.out.println("update : 데이터 수정");
				System.out.println("delete : 데이터 삭제");
				System.out.println("exit : 프로그램 종료");
				System.out.println("========================");
			} else if (command.equals("add")) {

				ids.add(articleId);
				
				System.out.println("제목을 입력해주세요 : ");
				String title = sc.nextLine();
				System.out.println("내용을 입력해주세요 : ");
				String body = sc.nextLine();
				titles.add(title);
				bodies.add(body);
				articleId++;

			} else if (command.equals("list")) {
				
				if(titles.size() == 0) {
					System.out.println("저장된 게시물이 없습니다.");
				} else {
					System.out.println("============================");
					for(int i = 0; i < titles.size(); i++) {
						System.out.println("번호 : "+ ids.get(i));
						System.out.println("제목 : " + titles.get(i));
						System.out.println("============================");
					}
					
				}
				
			} else if (command.equals("update")) {
				System.out.println("수정할 게시물 번호를 입력해주세요.");
				int id = Integer.parseInt(sc.nextLine()); //spring 문장으로 받은 것을 int 형식으로 변환하는 것.
				
				int isExist = 0; //0일때 없음, 1일때 있음
				for(int i =0; i<ids.size(); i++) {
					if(ids.get(i)==id) {
						isExist = 1;
						//수정
						System.out.println("제목 : ");
						String newtitle = sc.nextLine();
						System.out.println("내용 : ");
						String newbody = sc.nextLine();
						titles.set(i, newtitle);
						bodies.set(i, newbody);
						
						break;
					}
				}
				
				if(isExist==0) {
					System.out.println("없는 게시물 번호입니다.");
				}
			
			} else if (command.equals("delete")) {
				System.out.println("삭제할 게시물 번호를 입력해주세요.");
				int id = Integer.parseInt(sc.nextLine());
				
				int isExist = 0; //0일때 없음, 1일때 있음
				for(int i =0; i<ids.size(); i++) {
					if(ids.get(i)==id) {
						isExist = 1;
						//삭제
						ids.remove(i);
						titles.remove(i);
						bodies.remove(i);
						
						break;
					}
				}
				
				if(isExist==0) {
					System.out.println("없는 게시물 번호입니다.");
				}
			}
		}

	}

}