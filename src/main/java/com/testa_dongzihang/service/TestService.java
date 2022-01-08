package com.testa_dongzihang.service;

import com.testa_dongzihang.entity.Tests;
import com.testa_dongzihang.mapper.TestMapper;

import javax.annotation.Resource;
import java.util.List;

public interface TestService {
    List<Tests> getAll();
    List<Tests> getJias(Tests tests);
    List<Tests> getJs();
    List<Tests> getCs();
    String tianjia(Tests tests);
}
