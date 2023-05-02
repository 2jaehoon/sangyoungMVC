package day0501;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 * �Ϲ� Ŭ������ ���� Parameter�� �ޱ� ���ؼ� �ؾ��� ���� ����
 * HTTPServletRequest�� �Ű������� ������ �޼��带 ����
 * IOException, ServletException�� throws �Ѵ�.
 * @author user
 *
 */
public class TestParam {

	public void webParameter( HttpServletRequest request ) 
		throws ServletException, IOException{
		
		String value = request.getParameter("param");
		System.out.println("-- �Է¹��� parameter : " + value);
	}
	
}//class
