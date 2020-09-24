package com.kevin.dao.impl;

import com.kevin.dao.DemoDao;
import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {

  @Override
  public List<String> queryList() {
    return Arrays.asList("aaa", "bbb", "ccc");
  }
}
