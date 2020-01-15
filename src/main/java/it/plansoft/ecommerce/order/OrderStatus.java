package it.plansoft.ecommerce.order;

public enum OrderStatus {

    CREATED_TO_APPROVE,
    APPROVED_TO_PREPARE,
    PREPARED_TO_SHIP,
    SHIPPING,
    DELIVERED,
    REVIEWED
}