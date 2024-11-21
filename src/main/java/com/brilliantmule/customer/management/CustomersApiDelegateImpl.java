package com.brilliantmule.customer.management;

import com.brilliantmule.customer.management.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersApiDelegateImpl implements CustomersApiDelegate {

    /**
     * POST /customers : Create customers
     *
     * @param customer Customers to create (optional)
     * @return Customers created successfully (status code 201)
     * @see CustomersApi#createCustomers
     */
    @Override
    public ResponseEntity<Void> createCustomers(List<Customer> customer) {
        if (customer == null || customer.isEmpty()) {
            System.out.println("Request is null or empty");
        } else {
            System.out.println("Request contains " + customer.size() + " customers");
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
