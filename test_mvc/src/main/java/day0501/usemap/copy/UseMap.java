package day0501.usemap.copy;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		//각각의 클래스는 is a 관계가 아님.
		//1. map 생성
		Map<String, Person> map = new HashMap<String, Person>();
		//2. 값 할당
		map.put("y", new SangJun2());
		map.put("kt", new Kyoengtae2());
		map.put("km", new Kyumi2());
		//3. 키를 넣어 값을 얻고 
		
		
		String key = "km";//kt, km
		//객체 다형성이 지원되지 않으면 하나의 객체로만 사용하ㅐ야 하기 때문에 코딩량이 의미없이 증가한다.
		if("km".equals(key) ) {
		Person p = (Person)map.get(key); // 객체 다형성 p 는 SangJun2, KyeongTae2, Kyumi2 일수도 있다.
		//4. 얻은 값을 사용
		System.out.println(p.excute());
			}//end if
	}//main

}//class
