package day0501.usemap;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		//������ Ŭ������ is a ���谡 �ƴ�.
		//1. map ����
		Map<String, Object> map = new HashMap<String, Object>();
		//2. �� �Ҵ�
		map.put("y", new SangJun());
		map.put("kt", new Kyoengtae());
		map.put("km", new Kyumi());
		//3. Ű�� �־� ���� ��� 
		
		
		String key = "km";//kt, km
		if("y".equals(key) ) {
		SangJun sj = (SangJun)map.get(key);
		//4. ���� ���� ���
		System.out.println(sj.execute());
		}//end if
		
		if("kt".equals(key) ) {
			Kyoengtae kt = (Kyoengtae)map.get(key);
			//4. ���� ���� ���
			System.out.println(kt.execute());
			}//end if
		
		if("km".equals(key) ) {
			Kyumi km = (Kyumi)map.get(key);
			//4. ���� ���� ���
			System.out.println(km.execute());
			}//end if
	}//main

}//class
