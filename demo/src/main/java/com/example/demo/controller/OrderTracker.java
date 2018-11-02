package com.example.demo.controller;

import com.example.demo.model.ServiceStatus;
import com.example.demo.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderTracker {

    @Autowired
    OrderStatusService orderStatusService;

    @GetMapping(value = "/status/{id}", produces = "application/json; charset=UTF-8")
    public ServiceStatus getOrderStatus(@PathVariable("id") Integer id){
        return orderStatusService.getOrderStatus(id);
    }
}
