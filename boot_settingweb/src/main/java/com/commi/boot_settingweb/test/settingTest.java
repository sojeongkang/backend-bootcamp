package com.commi.boot_settingweb.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class settingTest {
    
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
				//데이터와 뷰 동시에 설정 가능
        ModelAndView mav = new ModelAndView("test"); //뷰 경로 설정
        
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        
        mav.addObject("name", "quartz"); 
        mav.addObject("list", resultList); 
        //mav.setViewName("test"); //이렇게 뷰 설정도 가능
        return mav; 
    }
 
}