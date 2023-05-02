package day0501;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 * 일반 클래스가 웹의 Parameter를 받기 위해서 해야할 일을 정의
 * HTTPServletRequest를 매개변수로 선언한 메서드를 정의
 * IOException, ServletException을 throws 한다.
 * @author user
 *
 */
public class TestParam {

	public void webParameter( HttpServletRequest request ) 
		throws ServletException, IOException{
		
		String value = request.getParameter("param");
		System.out.println("-- 입력받은 parameter : " + value);
	}
	
}//class
