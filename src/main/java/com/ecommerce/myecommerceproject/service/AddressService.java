package com.ecommerce.myecommerceproject.service;

import com.ecommerce.myecommerceproject.model.User;
import com.ecommerce.myecommerceproject.payload.AddressDTO;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);
}
