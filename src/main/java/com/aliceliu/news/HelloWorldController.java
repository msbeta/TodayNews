package com.aliceliu.news;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liu on 16-4-4.
 */
@Controller
@RequestMapping("/hello.do")
public class HelloWorldController{

    @RequestMapping
    @ResponseBody
    public ArrayList<News> load(ModelMap modelMap){
        //List<Object> list = new ArrayList<Object>();
        modelMap.put("message", "annohelllllllllllll");
        //return "hello";
        return News.newsList;
    }

}
