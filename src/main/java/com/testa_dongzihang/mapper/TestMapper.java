package com.testa_dongzihang.mapper;

import com.testa_dongzihang.entity.Tests;

import java.util.List;

public interface TestMapper {
    List<Tests> getAll();
    List<Tests> getJias(Tests tests);
    List<Tests> getJs();
    List<Tests> getCs();
    int tianjia (Tests tests);
}
