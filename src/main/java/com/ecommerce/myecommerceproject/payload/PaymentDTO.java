package com.ecommerce.myecommerceproject.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private Long paymentId;
    private String paymentMethod;
    private String pgPaymentId;
    private String pdStatus;
    private String pgResponseMessage;
    private String pgName;
}
