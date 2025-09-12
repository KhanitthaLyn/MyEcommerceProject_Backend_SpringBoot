package com.ecommerce.myecommerceproject.controller;

import com.ecommerce.myecommerceproject.model.User;
import com.ecommerce.myecommerceproject.payload.AddressDTO;
import com.ecommerce.myecommerceproject.service.AddressService;
import com.ecommerce.myecommerceproject.util.AuthUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AddressController {

    @Autowired
   AuthUtil authUtil;

    @Autowired
    AddressService addressService;

    @PostMapping("/addresses")
    public ResponseEntity<AddressDTO> createAddressById(AddressDTO addressDTO) {
        User user = authUtil.loggedInUser();
        AddressDTO savedAddressDTO = addressService.createAddress(addressDTO, user);
   return new ResponseEntity<>(savedAddressDTO, HttpStatus.CREATED);
    }
}
