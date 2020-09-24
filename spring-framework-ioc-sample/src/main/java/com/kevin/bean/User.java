package com.kevin.bean;

import java.io.Serializable;

/**
 * 用户
 *
 * @author wangyong
 */
public class User implements Serializable {

  private String userId;

  private String userName;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public String toString() {
    return "User{" + "userId='" + userId + '\''
        + ", userName='" + userName + '\''
        + '}';
  }
}
