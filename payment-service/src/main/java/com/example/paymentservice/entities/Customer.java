/*** Licensed under MIT License Copyright (c) 2022-2025 Raja Kolli. ***/
package com.example.paymentservice.entities;

import com.example.paymentservice.model.enums.CustomerStatus;

public class Customer {

    private Long id;

    private String name;

    private String email;

    private String address;

    private String phone;

    private double amountAvailable;

    private double amountReserved;

    private Integer version;

    private CustomerStatus customerStatus = CustomerStatus.ACTIVE;

    public Customer() {}

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }

    public double getAmountAvailable() {
        return this.amountAvailable;
    }

    public double getAmountReserved() {
        return this.amountReserved;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Customer setId(final Long id) {
        this.id = id;
        return this;
    }

    public Customer setName(final String name) {
        this.name = name;
        return this;
    }

    public Customer setEmail(final String email) {
        this.email = email;
        return this;
    }

    public Customer setAddress(final String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Customer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Customer setAmountAvailable(final double amountAvailable) {
        this.amountAvailable = amountAvailable;
        return this;
    }

    public Customer setAmountReserved(final double amountReserved) {
        this.amountReserved = amountReserved;
        return this;
    }

    /** Returns the optimistic locking version, or null if it has not been assigned. */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the optimistic locking version held by this instance.
     *
     * @param version the version to retain, or null to clear it
     * @return this instance
     */
    public Customer setVersion(Integer version) {
        this.version = version;
        return this;
    }

    public String toString() {
        return "Customer(id="
                + this.getId()
                + ", name="
                + this.getName()
                + ", email="
                + this.getEmail()
                + ", phone="
                + this.getPhone()
                + ", address="
                + this.getAddress()
                + ", amountAvailable="
                + this.getAmountAvailable()
                + ", amountReserved="
                + this.getAmountReserved()
                + ", customerStatus="
                + this.getCustomerStatus()
                + ")";
    }
}
