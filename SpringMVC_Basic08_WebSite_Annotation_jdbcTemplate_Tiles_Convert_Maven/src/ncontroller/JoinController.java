package ncontroller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.MemberDao;
import vo.Member;



@Controller
@RequestMapping("/joinus/")
public class JoinController {
	
	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping(value="join.htm" , method=RequestMethod.GET)
	public String join(){
		System.out.println("회원가입페이지 요청(UI)");
		
		//return "join.jsp";
		  return "joinus.join";
	}
	
	@RequestMapping(value="join.htm" , method=RequestMethod.POST)
	public String join(Member member) throws ClassNotFoundException, SQLException{
		System.out.println("회원가입");
		System.out.println(member.toString());
		
		memberDao.insert(member);
		return "redirect:/index.htm"; //주의 ...
	}
}




