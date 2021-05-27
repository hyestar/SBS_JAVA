import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

    // 선언
		// 이름을 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
    
    ArrayList<String>list = new ArrayList<String>();

    // add()
    // 리스트에 값을 추가해주세요.
    // "홍길동", "이순신", "황진이", "임꺽정", "강감찬", "을지문덕" 을 ArrayList에 추가 해주세요.
    list.add("홍길동");
    list.add("이순신");
    list.add("황진이");
    list.add("임꺽정");
    list.add("강감찬");
    list.add("을지문덕");

    // size()
		// 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
    // 출력결과 : 6
    System.out.println(list.size());

    // get()
		// 리스트의 2,3 인덱스의 값을 출력해주세요.
    // 출력결과 : 황진이, 임꺽정
    System.out.println(list.get(2));
    System.out.println(list.get(3));



    // 리스트의 모든 값을 출력해주세요.
    // 출력 결과 : 홍길동 이순신 황진이 임꺽정 강감찬 을지문덕
    for(int i =0; i<list.size(); i++){
      System.out.print(list.get(i));
    }

    System.out.println("");
    list.remove("홍길동");
    list.remove("이순신");
    System.out.println(list.get(2));
    System.out.println(list.get(3));


    // remove()
		// 리스트에서 홍길동, 이순신을 지운 뒤, 다시 2,3 인덱스의 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
    // 출력 결과 : 강감찬, 을지문덕

    // remove()하는 다른 방법이 하나 더 있음
    /*
    for(int i = 0; i<list.size();i++){
      if(list.get(i).equal("홍길동")){
        list.remove(i);
      }
    }
    
    for(int i = 0; i<list.size();i++){
      if(list.get(i).equal("이순신")){
        list.remove(i);
      }
    }
    */


    for(int i =0; i<list.size(); i++){
      System.out.print(list.get(i)+" ");
    }
    
        // 리스트의 모든 값을 출력해주세요.
    // 출력 결과 : 황진이 임꺽정 강감찬 을지문덕

    // add()
    // 리스트에 정약용을 추가시켜주세요.
    list.add("정약용");

		// 리스트의 모든 값을 출력해주세요.
    // 출력 결과 : 황진이 임꺽정 강감찬 을지문덕 정약용
    for(String name : list){
      System.out.print(name +" ");
    }
    System.out.println("----------------------");
    // set()
    // 임꺽정과 을지문덕을 신사임당과 유관순으로 바꿔주세요.
    for(int i = 0; i<list.size();i++){
      if(list.get(i).equals("임꺽정")){
        list.set(i,"신사임당"); 
      }
      if(list.get(i).equals("을지문덕")){
        list.set(i,"유관순"); 
      }
    }
    // 리스트의 모든 값을 출력해주세요.
    // 출력 결과 : 황진이 신사임당 강감찬 유관순 정약용


    // 리스트에서 황진이 신사임당 유관순만 출력해주세요.
    // 출력 결과 : 황진이 신사임당 유관순
    /*
      for(int i = 0; i<list.size();i++){
      if(list.get(i).equals("황진이")){
        list.get(i); 
      }
      if(list.get(i).equals("신사임당")){
        list.get(i); 
      }
      if(list.get(i).equals("유관순")){
        list.get(i); 
      }
    }
    */
    // 논리연산자 -> true, false 가지고 연산
    // 두 논리값이 모두 true면 연산결과 true 그 외 false -> and연산(&&)
    // 두 논리값이 모두 false면 연산결과 false 그 외 true -> or연산(||)
    for(String name : list){
      if(name.equals("황진이")||name.equals("신사임당")||name.equals("유관순")){
        System.out.println(name);
      }
    }

	}
}

