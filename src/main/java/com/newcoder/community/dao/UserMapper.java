package com.newcoder.community.dao;

import com.newcoder.community.entity.User;

public interface UserMapper {
    User selectById(int id);

    User selectByName(String name);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id,int status);

    int updeateHeader(int id,int headerUrl);

    int updatePassword(int id,String password);
}
