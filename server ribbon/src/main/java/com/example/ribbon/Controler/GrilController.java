package com.example.ribbon.Controler;

import com.example.ribbon.bean.GrilDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrilController {

    @Autowired
    private GrilDemo grilDemo ;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "hi you!!!";
    }

    @RequestMapping(value = "/gril", method = RequestMethod.GET)
    public String gril(){
        return grilDemo.toString();
    }
}
