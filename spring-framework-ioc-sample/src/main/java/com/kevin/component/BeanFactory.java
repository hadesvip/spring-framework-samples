package com.kevin.component;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangyong
 */
public class BeanFactory {

  private static Map<String, Object> BEAN_MAP = new ConcurrentHashMap<>();


  private static Properties prop;


  public static Object getBean(String beanName) {
    if (!BEAN_MAP.containsKey(beanName)) {
      synchronized (BeanFactory.class) {
        if (!BEAN_MAP.containsKey(beanName)) {
          try {
            Class<?> beanClazz = Class.forName(prop.getProperty(beanName));
            Object bean = beanClazz.newInstance();
            // 反射创建后放入缓存再返回
            BEAN_MAP.put(beanName, bean);
          } catch (ClassNotFoundException e) {
            throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
          } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("[" + beanName + "] instantiation error!", e);
          }


        }
      }
    }

    return BEAN_MAP.get(beanName);
  }
}
