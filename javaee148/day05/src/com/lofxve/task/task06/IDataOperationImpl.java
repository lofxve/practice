package com.lofxve.task.task06;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;

/**
 * @ClassName IDataOperationImpl
 * @Author com.lofxve
 * @Date 2020/12/17 19:13
 */
public class IDataOperationImpl implements IDataOperation<Student>{
    private Collection<Student> c = new ArrayList<>();
    @Override
    public boolean add(Student t) {
        Student student = get(t.getId());
        if (student != null) {
            return false;
        }else{
            c.add(t);
            return true;
        }
    }

    @Override
    public <T> boolean delete(T t) {
        Student student = get(t);
        if (student != null) {
            return false;
        }else{
            c.remove(t);
            return true;
        }
    }

    @Override
    public <T> boolean update(Student e) {
        Student student = get(e.getId());
        if (student != null) {
            return false;
        }else{
            student.setName(e.getName());
            student.setAge(e.getAge());
            student.setName(e.getName());
            return true;
        }
    }

    @Override
    public <T> Student get(T t) {
        if (!c.isEmpty()){
            for (Student student : c) {
                if (t.equals(student.getId())){
                    return student;
                }
            }
        }
        return null;
    }

    @Override
    public Collection<Student> getAll() {
        return c;
    }
}