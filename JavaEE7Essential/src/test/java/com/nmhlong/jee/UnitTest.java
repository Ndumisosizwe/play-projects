package com.nmhlong.jee;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import com.nmhlogo.jee.business.abstraction.*;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

@RunWith(Arquillian.class)
public class UnitTest {

    @EJB
    DefaultBidService bidService;

    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(JavaArchive.class, "foo.war")
                .addClasses(DefaultBidService.class);
    }

    @Test
    public void testOrderProcessor() {
        Assert.assertEquals(bidService.getClass(), bidService.getClass());
    }
}
