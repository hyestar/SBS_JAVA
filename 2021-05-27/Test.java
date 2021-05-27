package Test;

import java.util.ArrayList;

public class Main3 {

	public static void main(String[] args) {
	
		int [] arr = new int[5];
		String [] arr2 = new String[5];
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> list2= new ArrayList<String>();
		
		// 배열에서 추가 -> 없음
		
		// 리스트 추가 - add(저장할 값)
		list.add(10);
		list2.add("add");
		
		//list2.add("aa","bb","cc"); X
		
		//조회(가져오기), 읽기
		// 배열 - index를 지정해서 읽어온다. 
		System.out.println(arr[0]);
		
		//리스트 - index를 지정해서 읽어온다. get(index)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//수정
		//배열 - 수정할 데이터 index로 선택 후 대입연산자 이용
		arr[0]=100;
		System.out.println(arr[0]);
		
		//리스트 - 수정할 데이터 index로 선택 후 새로운 값을 set(index, 새로운 값)이용해 수정
		list2.set(0,"kkk");
		System.out.println(list2.get(0));
		
		//삭제
		//배열 - 없음
		//리스트 - 수정할 데이터 index를 선택 후 remove(index)사용
		list2.remove(0);
		System.out.println(list2.get(0));
		
		//길이
		//배열 - .length
		System.out.println(arr.length); // 배열의 길이가 유의미한 데이터의 길이를 의미하지는 않는다.
		
		//리스트 - .size
		System.out.println(list2.size()); //리스트의 사이즈가 곧 저장된 데이터의 갯수
	}

}