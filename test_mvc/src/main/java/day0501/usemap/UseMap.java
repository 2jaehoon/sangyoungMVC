package day0501.usemap;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		//각각의 클래스는 is a 관계가 아님.
		//1. map 생성
		Map<String, Object> map = new HashMap<String, Object>();
		//2. 값 할당
		map.put("y", new SangJun());
		map.put("kt", new Kyoengtae());
		map.put("km", new Kyumi());
		//3. 키를 넣어 값을 얻고 
		
		
		String key = "km";//kt, km
		if("y".equals(key) ) {
		SangJun sj = (SangJun)map.get(key);
		//4. 얻은 값을 사용
		System.out.println(sj.execute());
		}//end if
		
		if("kt".equals(key) ) {
			Kyoengtae kt = (Kyoengtae)map.get(key);
			//4. 얻은 값을 사용
			System.out.println(kt.execute());
			}//end if
		
		if("km".equals(key) ) {
			Kyumi km = (Kyumi)map.get(key);
			//4. 얻은 값을 사용
			System.out.println(km.execute());
			}//end if
	}//main

}//class
