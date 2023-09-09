package com.francisco.hexagonal.adapters.out.repository.mapper;

import com.francisco.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.francisco.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

}
