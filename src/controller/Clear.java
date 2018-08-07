package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Clear {
	
	@RequestMapping("/clear")
	public ModelAndView clear(HttpSession session){
		
		Integer i = (Integer) session.getAttribute("counter");
		if(i==0){
		session.setAttribute("counter", i);}
		else{
			i =0;
			session.setAttribute("counter", i);
		}		
		ModelAndView mav = new ModelAndView("redirect:check");
		return mav;
	}
	
}
