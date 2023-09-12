package com.francisco.hexagonal.adapters.out;

import com.francisco.hexagonal.adapters.out.repository.CustomerRepository;
import com.francisco.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    private final CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }

}
