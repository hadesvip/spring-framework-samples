package com.kevin.quick.start.dao.impl;

import com.kevin.quick.start.dao.BaseDao;
import java.util.Collections;
import java.util.List;

public class OracleDaoImpl implements BaseDao {

  @Override
  public List<String> queryList() {
    return Collections.singletonList("oracle");
  }
}
