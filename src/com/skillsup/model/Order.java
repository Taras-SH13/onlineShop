package com.skillsup.model;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    List<PositionTtem> item;
    BigDecimal total;
    User user;
    OrderStatus orderStatus;

    class PositionTtem{
        Order order;
        int amount;
        BigDecimal subtotal;
    }
}
