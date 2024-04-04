package com.market.ex.market.domain;

import java.util.List;

public class Client {
    
    private String clientId;
    private String name;
    private String lastname;
    private String phone;
    private String address;
    private String email;

    private List<Purchase> purchases;

    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Purchase> getPurchases() {
        return purchases;
    }
    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    
}
