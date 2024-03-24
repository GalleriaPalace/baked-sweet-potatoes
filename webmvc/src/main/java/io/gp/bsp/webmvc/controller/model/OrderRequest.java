package io.gp.bsp.webmvc.controller.model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.Date;
import java.util.List;

/**
 * 고객의 주문 요청
 */
public class OrderRequest {
    private String userId;
    private List<String> productId;
    private OffsetDateTime orderYmdt;


    public String getUserId() {
        return userId;
    }

    public List<String> getProductId() {
        return productId;
    }

    public OffsetDateTime getOrderYmdt() {
        return orderYmdt;
    }
}
