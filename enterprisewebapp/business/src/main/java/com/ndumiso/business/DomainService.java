package com.ndumiso.business;

import javax.ejb.Stateless;

@Stateless
public class DomainService {
    public void printMessage() {
        System.out.println("Hello world from session bean ! ***************");
    }
}
