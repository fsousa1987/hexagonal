package com.francisco.hexagonal.application.ports.out;

import com.francisco.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
