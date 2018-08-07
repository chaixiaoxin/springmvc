package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;

@Controller
public class ProductController {
	
	@RequestMapping("/addProduct")
	public ModelAndView add(Product product)throws Exception{
		
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		ModelAndView mav = new ModelAndView("showProduct");
		mav.addObject("product", product);
		return mav;		
	}
	
	@RequestMapping("/jump")
	public ModelAndView jump(){
		ModelAndView mav = new ModelAndView("redirect:/hello");
		return mav;
	}
	
	@RequestMapping("/check")
	public ModelAndView check(HttpSession session){
		Integer i = (Integer) session.getAttribute("counter");
		if(i==null)
			i =0;
		i++;
		session.setAttribute("counter",i);
		ModelAndView mav = new ModelAndView("check");
		return mav;
		
	}
}
