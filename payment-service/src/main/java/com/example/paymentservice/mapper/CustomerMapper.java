/*** Licensed under MIT License Copyright (c) 2023-2025 Raja Kolli. ***/
package com.example.paymentservice.mapper;

import com.example.paymentservice.entities.Customer;
import com.example.paymentservice.model.request.CustomerRequest;
import com.example.paymentservice.model.response.CustomerResponse;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public Customer toEntity(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setName(customerRequest.name());
        customer.setEmail(customerRequest.email());
        customer.setAddress(customerRequest.address());
        customer.setPhone(customerRequest.phone());
        customer.setAmountAvailable(customerRequest.amountAvailable());
        customer.setCustomerStatus(customerRequest.status());
        return customer;
    }

    public CustomerResponse toResponse(Customer customer) {
        return new CustomerResponse(
                customer.getId(),
                customer.getName(),
                customer.getEmail(),
                customer.getPhone(),
                customer.getAddress(),
                customer.getAmountAvailable(),
                customer.getCustomerStatus());
    }

    public void mapCustomerWithRequest(Customer customer, CustomerRequest customerRequest) {
        customer.setAmountAvailable(customerRequest.amountAvailable());
        customer.setName(customerRequest.name());
        customer.setAddress(customerRequest.address());
        customer.setEmail(customerRequest.email());
        customer.setPhone(customerRequest.phone());
        customer.setCustomerStatus(customerRequest.status());
    }

    public List<CustomerResponse> toListResponse(List<Customer> customerList) {
        return customerList.stream().map(this::toResponse).toList();
    }
}
