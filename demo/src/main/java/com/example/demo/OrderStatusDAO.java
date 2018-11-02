package com.example.demo;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public final class OrderStatusDAO {


    private Map<Integer, Status> OrderStatus = new HashMap<>();


    @PostConstruct
    public void init() {
        OrderStatus.put(12324123, Status.Making);
        OrderStatus.put(34342423, Status.Baking);
        OrderStatus.put(45353455, Status.Boxing);
        OrderStatus.put(5646466, Status.OnItsWay);
        OrderStatus.put(65464564, Status.Delivered);
    }


    public String getOrderStatusById(Integer id) {
        return OrderStatus.get(id).status;
    }


    public enum Status {
        Making("Making"), Baking("Baking"), Boxing("Boxing"), OnItsWay("On Its Way"), Delivered("Delivered");

        private String status;

        Status(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }

    }

}
