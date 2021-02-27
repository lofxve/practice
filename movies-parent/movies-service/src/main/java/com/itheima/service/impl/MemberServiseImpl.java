package com.itheima.service.impl;

import com.itheima.dao.MembersDao;
import com.itheima.domain.Members;
import com.itheima.domain.MembersExample;
import com.itheima.service.MemberServise;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MemberServiseImpl
 * @Author lofxve
 * @Date 2021/1/16 8:54
 * @Version 1.0
 */
@Service
public class MemberServiseImpl implements MemberServise {
    @Autowired
    private MembersDao membersDao;

    @Override
    public Members login(String name, String password) {
        MembersExample membersExample = new MembersExample();
        MembersExample.Criteria criteria = membersExample.createCriteria().andUsernameEqualTo(name).andPasswordEqualTo(password);
        List<Members> members = membersDao.selectByExample(membersExample);
        if (members != null && members.size() > 0) {
            return members.get(0);
        } else {
            return null;
        }
    }
}