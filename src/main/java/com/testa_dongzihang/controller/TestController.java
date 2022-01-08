package com.testa_dongzihang.controller;

import com.testa_dongzihang.entity.Tests;
import com.testa_dongzihang.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("testcontroller")
public class TestController {
    @Resource
    private TestService testService;
    @RequestMapping("getAll")
    @ResponseBody
    public List<Tests> getAll(){
        return testService.getAll();
    }

    @RequestMapping("getJias")
    @ResponseBody
    public List<Tests> getJias(Tests tests){
        return  testService.getJias(tests);
    }

    @RequestMapping("getJs")
    @ResponseBody
    public Map getJs(){
        Map<String,List<Tests>> map = new HashMap<>();
        List<Tests> jlisttest = testService.getJs();
        List<Tests> slisttest = testService.getCs();
        map.put("jlist",jlisttest);
        map.put("slist",slisttest);
        return map;
    }

    @RequestMapping("tianjia")
    @ResponseBody
    public String tianjia (@RequestBody Tests tests){
        return testService.tianjia(tests);
    }
}
