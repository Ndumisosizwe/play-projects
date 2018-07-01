package com.nmhlogo.jee;

import com.nmhlogo.jee.business.abstraction.impl.BidService;
import com.nmhlogo.jee.domain.Bid;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/serv")
public class HomeServlet extends HttpServlet {

    @EJB
    BidService bidService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("emailAddress");
        bidService.addBid( new Bid(name));
    }
}
