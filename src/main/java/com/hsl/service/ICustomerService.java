package com.hsl.service;

import com.hsl.model.Customer;
import com.hsl.model.Province;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}