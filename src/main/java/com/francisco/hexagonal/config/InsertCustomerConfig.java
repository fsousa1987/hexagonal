package com.francisco.hexagonal.config;

import com.francisco.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.francisco.hexagonal.adapters.out.InsertCustomerAdapter;
import com.francisco.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       InsertCustomerAdapter insertCustomerAdapter) {

        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter);
    }

}
