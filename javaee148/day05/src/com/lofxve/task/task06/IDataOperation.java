package com.lofxve.task.task06;

import java.util.Collection;

/**
 * @ClassName IDataOperation
 * @Author com.lofxve
 * @Date 2020/12/17 19:12
 */
public interface IDataOperation<E> {
    // 添加数据
    public boolean add(E t);
    // 根据唯一标识删除一个数据
    public <T> boolean delete(T t);
    // 修改一个数据
    public <T> boolean update(E e);
    // 根据唯一表示查找一个数据
    public <T> E get(T t);
    // 查找所有数据
    public Collection<E> getAll();
}