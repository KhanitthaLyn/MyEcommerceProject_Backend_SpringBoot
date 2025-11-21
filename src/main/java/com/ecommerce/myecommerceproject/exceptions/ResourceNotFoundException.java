package com.ecommerce.myecommerceproject.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    String resourceName;
    String field;
    String fieldName;
    Long fieldId;

    public ResourceNotFoundException(String message, Throwable cause, String resourceName, String field, String fieldName) {
        super(String.format("Resource %s not found : %s %s", resourceName, field, fieldName));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldName = fieldName;
    }

    public ResourceNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String resourceName, String field, Long fieldId) {
        super(String.format("Resource %s not found : %s %d", resourceName, field, fieldId));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldId = fieldId;
    }

    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        if (fieldValue instanceof Long) {
            this.fieldId = (Long) fieldValue;
        } else {
            this.field = String.valueOf(fieldValue);
        }
    }
}
