package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author mxw01
 * @create 2021-10-12 10:53
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
