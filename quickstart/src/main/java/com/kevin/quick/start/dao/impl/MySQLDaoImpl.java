package com.kevin.quick.start.dao.impl;

import com.kevin.quick.start.dao.BaseDao;
import java.util.Collections;
import java.util.List;

public class MySQLDaoImpl implements BaseDao {

  @Override
  public List<String> queryList() {
    return Collections.singletonList("mysql");
  }
}
