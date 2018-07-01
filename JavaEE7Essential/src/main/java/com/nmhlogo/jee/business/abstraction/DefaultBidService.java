package com.nmhlogo.jee.business.abstraction;

import com.nmhlogo.jee.business.abstraction.impl.BidService;
import com.nmhlogo.jee.dao.BidDao;
import com.nmhlogo.jee.domain.Bid;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;

@Stateless
@Transactional
public class DefaultBidService implements BidService {

    @Inject
    private BidDao bidDao;

    @Override
    @TransactionAttribute(value = TransactionAttributeType.REQUIRED)
    public void addBid(@Valid Bid bid) {
        bidDao.addBid(bid);
    }
}
