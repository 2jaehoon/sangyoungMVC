package day0501.usemap.copy;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		//������ Ŭ������ is a ���谡 �ƴ�.
		//1. map ����
		Map<String, Person> map = new HashMap<String, Person>();
		//2. �� �Ҵ�
		map.put("y", new SangJun2());
		map.put("kt", new Kyoengtae2());
		map.put("km", new Kyumi2());
		//3. Ű�� �־� ���� ��� 
		
		
		String key = "km";//kt, km
		//��ü �������� �������� ������ �ϳ��� ��ü�θ� ����Ϥ��� �ϱ� ������ �ڵ����� �ǹ̾��� �����Ѵ�.
		if("km".equals(key) ) {
		Person p = (Person)map.get(key); // ��ü ������ p �� SangJun2, KyeongTae2, Kyumi2 �ϼ��� �ִ�.
		//4. ���� ���� ���
		System.out.println(p.excute());
			}//end if
	}//main

}//class
