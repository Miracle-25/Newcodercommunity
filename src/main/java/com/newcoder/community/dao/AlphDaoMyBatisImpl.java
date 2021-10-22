package com.newcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("alphaMyBatis")
//@Primary
public class AlphDaoMyBatisImpl implements AlphDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
