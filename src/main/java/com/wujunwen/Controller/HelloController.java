package com.wujunwen.Controller;

import com.wujunwen.Properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Keven on 2017/10/1.
 */
@RestController
public class HelloController {
//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private int age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET)
    public String say() {
        return girlProperties.getCupSize();
    }

    @RequestMapping(value = {"/say", "/say2"}, method = RequestMethod.GET)
    public String say2(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myid) {
        return "id:" + myid;
    }

//  @RequestMapping(value="/testvar/{id}",method = RequestMethod.GET)
    @GetMapping(value = "/testvar/{id}")
    public String test3(@PathVariable(value = "id") Integer testvar){
        return "testvar:"+testvar;
    }
}
