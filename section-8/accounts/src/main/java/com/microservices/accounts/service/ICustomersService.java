package com.microservices.accounts.service;

import com.microservices.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {

    /**
     *
     * @param mobileNumber- input
     * @return customer details based on given mobileNumber
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
