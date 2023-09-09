package com.francisco.hexagonal.adapters.out.client.mapper;

import com.francisco.hexagonal.adapters.out.client.response.AddressResponse;
import com.francisco.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
