package kr.ac.hit.myapp.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@RequestMapping(value="/member/add.do",method=RequestMethod.GET)
	public String addForm() {
		return "member/memAdd";
	}
	
	@RequestMapping(value="/member/add.do",method=RequestMethod.POST)
	public String add(MemberVo vo) {
		System.out.println(vo.getMemId());
		System.out.println(vo.getMemName());
		System.out.println(vo.getMemPass());
		System.out.println(vo.getMemPoint());
		return "member/memAdd";
	}
}
