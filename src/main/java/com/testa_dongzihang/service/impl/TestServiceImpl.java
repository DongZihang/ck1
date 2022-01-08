package com.testa_dongzihang.service.impl;

import com.testa_dongzihang.entity.Tests;
import com.testa_dongzihang.mapper.TestMapper;
import com.testa_dongzihang.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public List<Tests> getAll() {
        return testMapper.getAll();
    }

    @Override
    public List<Tests> getJias(Tests tests) {
        return testMapper.getJias(tests);
    }

    @Override
    public List<Tests> getJs() {
        return testMapper.getJs();
    }

    @Override
    public List<Tests> getCs() {
        return testMapper.getCs();
    }

    @Override
    public String tianjia(Tests tests) {
        if(testMapper.tianjia(tests)!=0){
            return "ok";
        }else{
            return "no";
        }
    }
}
