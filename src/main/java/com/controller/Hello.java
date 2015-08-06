package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
  
@Controller  
public class Hello {  
  
//    @RequestMapping(value="index.do")  
//    public void index_jsp(Model model){  
//        model.addAttribute("liming", "ÀèÃ÷ÄãºÃ");  
//        System.out.println("index.jsp");  
//    }  
	
//	http://localhost:8080/springMvcTest/index
    @RequestMapping("index")  
    public String index_jsp(){  
    	System.out.println("index.jsp");
    	return "index";
    }  
}  
