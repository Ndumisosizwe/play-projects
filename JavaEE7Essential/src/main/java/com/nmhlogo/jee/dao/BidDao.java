package com.nmhlogo.jee.dao;

import com.nmhlogo.jee.domain.Bid;

import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.persistence.*;

@Named
@ManagedBean
public class BidDao {

    @PersistenceUnit(unitName = "testUnit")
    private EntityManagerFactory entityManagerFactory;

    public void addBid(Bid bid) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.persist(bid);
        System.out.println("*****************************");
    }
}
