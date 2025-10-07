package com.ecommerce.myecommerceproject.service;

import com.ecommerce.myecommerceproject.payload.StripePaymentDto;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface StripeService {

    PaymentIntent paymentIntent(StripePaymentDto stripePaymentDto) throws StripeException;
}