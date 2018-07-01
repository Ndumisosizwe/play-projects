package com.nmhlogo.jee.business.abstraction.impl;

import com.nmhlogo.jee.domain.Bid;

import javax.ejb.Local;
import javax.validation.Valid;

@Local
public interface BidService {

    void addBid(@Valid Bid bid);
}
