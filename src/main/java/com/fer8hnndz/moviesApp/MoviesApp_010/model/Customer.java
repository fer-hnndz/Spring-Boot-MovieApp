package com.fer8hnndz.moviesApp.MoviesApp_010.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    private long customer_id;

    private long store_id;
    private String first_name;
    private String last_name;
    private String email;
    private String address_id;
    private boolean active;

    private String create_date;
    private String last_update;

    public void setStore_id(long store_id) {
        this.store_id = store_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress_id(String address_id) {
        this.address_id = address_id;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public long getStore_id() {
        return store_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress_id() {
        return address_id;
    }

    public boolean isActive() {
        return active;
    }

    public String getCreate_date() {
        return create_date;
    }

    public String getLast_update() {
        return last_update;
    }

    public Customer(long customer_id, long store_id, String first_name, String last_name, String email,
            String address_id, boolean active, String create_date, String last_update) {
        this.customer_id = customer_id;
        this.store_id = store_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.address_id = address_id;
        this.active = active;
        this.create_date = create_date;
        this.last_update = last_update;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return String.format(
                "Customer [customer_id=%d, store_id=%d, first_name='%s', last_name='%s', email='%s', address_id='%s', active=%b, create_date='%s', last_update='%s']",
                customer_id, store_id, first_name, last_name, email, address_id, active, create_date, last_update);
    }

}
