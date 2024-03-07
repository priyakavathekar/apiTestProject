package com.study.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String custname;
    private String address;

public Customer(){}

    public Customer(String name,String address, Long id){

        this.custname = name;
        this.address = address;
        this.id = id;


    }


    @Column(name = "address", nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




    public void setCustname(String customerName) {
        this.custname = customerName;
    }


    @Column(name = "custname", nullable = false)
    public String getCustname() {
        return custname;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + custname + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }




    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }
}
