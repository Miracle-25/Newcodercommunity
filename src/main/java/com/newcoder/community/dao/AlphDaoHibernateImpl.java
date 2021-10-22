package com.newcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
@Primary
public class AlphDaoHibernateImpl implements AlphDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
