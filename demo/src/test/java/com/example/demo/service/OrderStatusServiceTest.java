package com.example.demo.service;


import com.example.demo.OrderStatusDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {OrderStatusDAO.class})
public class OrderStatusServiceTest {


    @Autowired
    private OrderStatusDAO orderStatusDAO;

    @Test
    public void testOrderStatusGet() {
        String status = orderStatusDAO.getOrderStatusById(45353455);

        //then
        assertEquals(OrderStatusDAO.Status.Boxing.getStatus(), status);

    }
}
