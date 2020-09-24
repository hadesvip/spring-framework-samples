package com.kevin.quick.start.domain;

/**
 * @author wangyong
 */
public class Cat {

  private String name;
  private Person master;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person getMaster() {
    return master;
  }

  public void setMaster(Person master) {
    this.master = master;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Cat{");
    sb.append("name='").append(name).append('\'');
    sb.append(", master=").append(master);
    sb.append('}');
    return sb.toString();
  }
}
