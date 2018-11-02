package com.example.demo.model;

public class ServiceStatus {

    private Integer orderId;

    private String status;

    public ServiceStatus(Integer orderId, String status) {
        this.orderId = orderId;
        this.status = status;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }
}
