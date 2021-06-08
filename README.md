# SBS_JAVA
**반복문**


for문의 배열 전체 탐색할때에는 왼쪽에는 하나담을 임시변수 오른쪽에는 배열이름을 적는다.

for(int i : arr){}

---
**자동임포트**

ctrl + shift + o
  => import java.util.Scanner; ----- import java.util.ArrayList;

---

**리스트**

ArrayList<Integer> list = new ArrayList<Integer>();

ArrayList<String> list2= new ArrayList<String>();

* 리스트 추가 - add(저장할 값)
  * list.add(10);
  * list2.add("add");
* 리스트

1. 배열
- 길이 고정 -> 자원을 효율적 사용
- 삭제X -> 구현 -> 자원의 소모 -> 리스트
- 길이 제한이 있어서 자료를 많이 저장할 수가 없다.

2. 리스트
- 길이 제한이 없다.

---
**클래스**

1. class라는 것은 틀, 설계도 역할을 한다.
2. 객체화(class의 복사본 만드는 것)
3. 만들어진 복사본을 객체, 인스턴스, 오브젝트라고 부른다.
4. 만들어진 객체는 이름이 없다. 구분하기 위해서 변수와 연결한다.
5. 객체의 변수는 타입이 class명과 같아야 한다.

* class와 객체(인스턴스)의 관계
* 변수에 객체를 저장할 때 객체 그 자체가 저장되는 것이 아니고, 객체의 참조값(객체주민번호)이 저장되는 것이다.
---
**생성자**

1. 반드시 클래스명과 동인한 메서드
2. return 타입이 없다.(생성자는 리턴타입이 지정되 있으므로)
3. 객체를 만들 때 반드시 한번 실행
---
** class와 객체 **

1. 데이터 -> 현실을 반영(사물, 개념)
2. 구조화 -> 자료구조
3. 자료구조를 처리 및 연산(가공) -> 캐릭터의 이동(좌표의 이동) : 메서드(함수)
4. 메서드는 자료구조에 종속적이다.
5. 데이터는 어떤 사물, 사람의 속성, 메서드는 기능 -> 사물이나 개념을 표현(class)
6. 해당 사물을 대량 생산 -> 복사본(객체, 인스턴스)
---
- **프로그래밍 4대 요소 -> 문제해결에 있어서**
- ** 객체지향 -> 프로그래밍 방법론(패러다임) **
- ** 작은 소프트웨어(객체)를 쌓아서 더 큰 소프트웨어를 만드는 방식 **
---