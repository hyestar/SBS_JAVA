// 입력값에 help를 입력하면 아래처럼 나오게 해주세요.
// 명령어를 입력해주세요: 는 exit를 치기 전까지 계속 나와야 합니다.

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
/*
(입출력 예시)

명령어를 입력해주세요 : add (입력)

저장할 값을 입력해주세요 : hello (입력)
hello 이/가 저장되었습니다.

*/
/*
명령어를 입력해주세요: read

현재 저장되어 있는 값 : hello

만약 add, read, exit 말고 다른 값을 입력하면 '올바른 명령어를 입력해주세요 출력'
*/
/*
어떤 값으로 수정할까요 : 'hi'
hi로 값이 수정되었습니다.

만약 add, read, update, exit 말고 다른 값을 입력하면 '올바른 명령어를 입력해주세요 출력'
*/
/*
명령어를 입력해주세요 : delete
hello 값이 삭제되었습니다.

명령어를 입력해주세요 : read
저장된 데이터가 없습니다.

* 만약2 add, read, update, delete, exit 말고 다른 값을 입력하면 '올바른 명령어를 입력해주세요 출력'
*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str="";
    while(true){
      System.out.printf("명령어를 입력해주세요 : ");
      String cmd = scan.next();
      if(cmd.equals("help")){
        System.out.println("add : 데이터 추가");
        System.out.println("read : 데이터 조회");
        System.out.println("update : 데이터 수정");
        System.out.println("delete : 데이터 삭제");
        System.out.println("exit : 프로그램 종료");
        System.out.printf("명령어를 입력해주세요: ");
        String cmd2 = scan.next();
         if(cmd2.equals("add")){
          System.out.printf("저장할 값을 입력해주세요 : ");
          str = scan.next();
          System.out.println(str + " 이/가 저장되었습니다.");
          }
         else if(cmd2.equals("read")){
            if(str.equals("\0")){
              System.out.println("저장된 데이터가 없습니다.");
            }
            else{
              System.out.println("현재 저장되어 있는 값 : "+str);
              }
            }
         else if(cmd2.equals("update")){
            System.out.printf("어떤 값으로 수정할까요 : ");
            str=scan.next();
            System.out.println(str+"로 값이 수정되었습니다.");
         }
         else if(cmd2.equals("delete")){
           System.out.println(str+" 값이 삭제되었습니다.");
           str="\0";
         }

         else{
          System.out.println("올바른 명령어를 입력해주세요.");
         }
      }
      else if(cmd.equals("exit")){
        break;
      }
    }
  }
}