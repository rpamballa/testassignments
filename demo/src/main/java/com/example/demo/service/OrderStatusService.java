package com.example.demo.service;

import com.example.demo.OrderStatusDAO;
import com.example.demo.model.ServiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderStatusService {


    @Autowired
    OrderStatusDAO statusDAO;

    public ServiceStatus getOrderStatus(Integer id){
        String status = statusDAO.getOrderStatusById(id);
        return new ServiceStatus(id, status);
    }

}
