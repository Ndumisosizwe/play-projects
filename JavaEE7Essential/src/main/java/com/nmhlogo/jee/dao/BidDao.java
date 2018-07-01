package com.nmhlogo.jee.dao;

import com.nmhlogo.jee.domain.Bid;

import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.persistence.*;

@Named
@ManagedBean
public class BidDao {

    @PersistenceContext(unitName = "testUnit")
    private EntityManager em;

    public void addBid(Bid bid) {
        em.persist(bid);
        System.out.println("*****************************");
    }
}
