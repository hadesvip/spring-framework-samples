package com.kevin;

import com.kevin.bean.User;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class OOMTest {


  @Test
  public void stackOOMTest() {

  }


  /**
   * 堆内存溢出
   */
  @Test
  public void heapOOMTest() {
    List<User> userList = new ArrayList<>();
    while (true) {
      userList.add(new User());
    }
  }


  /**
   * 元空间内存溢出
   */
  @Test
  public void metaspaceOOMTest() {
    List<String> stringList = new ArrayList<>();
    String str = "metaspace_oom_test";
    while (true) {
      String str2 = str + str;
      str = str2;
      stringList.add(str.intern());
    }
  }

  /**
   * 直接内存溢出
   */
  @Test
  public void directOOMTest() {



  }


}
