package com.sj.ifaces;

public interface DAO<T> {
  
  public Object add(T object);
  public T find(Object key);

}
