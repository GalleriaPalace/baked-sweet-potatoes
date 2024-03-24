package io.gp.bsp.webmvc.model;

import io.gp.bsp.webmvc.controller.model.OrderRequest;

public class Order {
    private final long orderId;

    public Order(OrderRequest orderRequest) {
        this.orderId = 1L;
    }
}
