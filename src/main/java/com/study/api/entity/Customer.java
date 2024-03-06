package com.study.api.entity;

public class Customer {

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    private String customerName;

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", number=" + number +
                ", address='" + address + '\'' +
                '}';
    }

    private int number;
    private String address;


}
