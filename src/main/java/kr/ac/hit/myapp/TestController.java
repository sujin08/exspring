package kr.ac.hit.myapp;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	
	@RequestMapping("/test/a.do")
	public String aaa() {
		return "test";
	}
	
	@RequestMapping("/test/v.do")
	public String bbb(int x, @RequestParam("y") int b, Map m) {
		// @RequestParam("y") == String y 이면 생략
		//뱐수타입에 맞게 자동으로 형변환
		System.out.println(x);
		System.out.println(b);
		
		int sum = x+b;
		
		m.put("total", sum);
		
		return "result";
	}
	

		@RequestMapping("/test/b.do")
		public String ccc(@ModelAttribute("point")Point vo, Map m) {
			// @RequestParam("y") == String y 이면 생략
			//뱐수타입에 맞게 자동으로 형변환

			int sum = vo.getX()+vo.getY();
			
			m.put("total", sum);
			
			return "result";
		}
	}
	
	

