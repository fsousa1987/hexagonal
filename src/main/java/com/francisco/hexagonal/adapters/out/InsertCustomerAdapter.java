package com.francisco.hexagonal.adapters.out;

import com.francisco.hexagonal.adapters.out.repository.CustomerRepository;
import com.francisco.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.francisco.hexagonal.application.core.domain.Customer;
import com.francisco.hexagonal.application.ports.out.InsertCustomerOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
