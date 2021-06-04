
import java.util.ArrayList;
import java.util.Scanner;
public class ex {

		static int articleId = 1; // 게시물 번호
		static Scanner sc = new Scanner(System.in);	
		
		static ArrayList<Article> articles = new ArrayList<Article>();
		
//		static ArrayList<Integer> ids = new ArrayList<Integer>();
//		static ArrayList<String> titles = new ArrayList<String>();
//		static ArrayList<String> bodies = new ArrayList<String>();
		
		public static void main(String[] args) {
			while (true) {
				System.out.println("명령어를 입력해주세요 :");
				String command = sc.nextLine();

				if (command.equals("exit")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if (command.equals("help")) {
					printHelp();
					
				} else if (command.equals("add")) {
					add();

				} else if (command.equals("list")) {
					list(articles);
					
				} else if (command.equals("update")) {
					update();
					
				} else if (command.equals("delete")) {
					delete();
					
				} else if(command.equals("search")) {
					search();
				}
			}
		}
		
		// articles에 들어있는 모든내용을 검색하여 조건에 맞는 것을 searchedList에 넣는다.
		// searchedList에 있는 내용을 list()로 넘겨 출력하겠다.
		public static void search() {
			System.out.println("검색 키워드를 입력해주세요 : ");
			String keyword = sc.nextLine();
			
			ArrayList<Article> searchedList = new ArrayList<Article>();
			
			for(int i = 0; i < articles.size(); i++) {
				Article article = articles.get(i);
				if(articles.get(i).title.contains(keyword)) {
					searchedList.add(article);				
				}
			}
			
			list(searchedList);
		}


		public static void printNotFound() {
			System.out.println("없는 게시물입니다.");	
		}
		
		public static void printHelp() {
			System.out.println("========================");
			System.out.println("help : 도움말");
			System.out.println("add : 데이터 추가");
			System.out.println("read : 데이터 조회");
			System.out.println("update : 데이터 수정");
			System.out.println("delete : 데이터 삭제");
			System.out.println("exit : 프로그램 종료");
			System.out.println("========================");
		}
		
		public static void add() {
			Article article = new Article();
			article.id = articleId;
// 			Article.add(articleId);
			
			System.out.println("제목을 입력해주세요 : ");
			String title = sc.nextLine();
			System.out.println("내용을 입력해주세요 : ");
			String body = sc.nextLine();
			article.title = title;
			article.body = body;
			articles.add(article);
			
			articleId++;
		}
		
		// ArrayList<타입> 변수  ==> 함수의 매개변수에서 받아오는 일종의 단위라고 생각하기 묶음으로 구성된 리스트형식으로 받아온다!!
		public static void list(ArrayList<Article> list) {

			if(articles.size() == 0) {
				System.out.println("저장된 게시물이 없습니다.");
			} else {
				System.out.println("============================");
				for(int i = 0; i < list.size(); i++) {
					Article article = list.get(i); // articles의 묶음 리스트를 Article class의 구조를 갖는 article을 만들어 get 해오겠다.
					System.out.println("번호 : " + article.id);
					System.out.println("제목 : " + article.title);
					System.out.println("============================");
				}
				
			}
		}
		
		public static void update() {
			System.out.println("수정할 게시물 번호를 입력해주세요 : ");
			int id = Integer.parseInt(sc.nextLine());

			int i = getIndexById(id);
			
			if(i != -1) {			
				System.out.println("새제목을 입력해주세요 : ");
				String title = sc.nextLine();
				System.out.println("새내용을 입력해주세요 : ");
				String body = sc.nextLine();
				
				Article newArticle = new Article();
				newArticle.id=id;
				newArticle.title=title;
				newArticle.body=body;
				articles.set(i, newArticle);
						
			}
					
		
		}
		
		//===============================================================
		// 게시물을 삭제하는 메서드
		public static void delete() {
			System.out.println("삭제할 게시물 번호를 입력해주세요 : ");
			int id = Integer.parseInt(sc.nextLine()); // String 형식으로 되어있는
			
			int i = getIndexById(id);
					
			if(i != -1) {
				articles.remove(i);			
			}
			
		}
		//===============================================================
		// 게시물의 번호를 매개변수로 받아 해당 게시물의 저장 위치(index)를 찾아주는 메서드
		public static int getIndexById(int id) {
			
			int targetIndex = -1;
			
			for(int i = 0; i < articles.size(); i++) {
				if(articles.get(i).id == id) {
					targetIndex = i;
				}
			}
			
			// 게시물 찾지 못했을 때.
			if(targetIndex == -1) {
				printNotFound();			
			}
			
			return targetIndex;
		}
		//===============================================================	
	}