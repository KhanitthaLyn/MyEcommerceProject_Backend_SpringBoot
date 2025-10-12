package com.ecommerce.myecommerceproject.service;

import com.ecommerce.myecommerceproject.payload.OrderDTO;
import com.ecommerce.myecommerceproject.payload.OrderResponse;
import jakarta.transaction.Transactional;

public interface OrderService {
    @Transactional
    OrderDTO PlaceOrder(String emailId, Long addressId, String paymentMethod, String pgName, String pgPaymentId, String pgStatus, String pgResponseMessage);


    OrderResponse getAllOrders(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    OrderDTO updateOrder(Long orderId, String status);

}
