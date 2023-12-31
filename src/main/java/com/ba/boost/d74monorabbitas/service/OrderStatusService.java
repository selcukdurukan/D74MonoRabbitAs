package com.ba.boost.d74monorabbitas.service;


import com.ba.boost.d74monorabbitas.model.Order;
import com.ba.boost.d74monorabbitas.model.OrderStatus;
import com.ba.boost.d74monorabbitas.producer.ProducerRabbit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderStatusService {

    private final ProducerRabbit producerRabbit;

    public String makeOrder(Order order, String restaurantName) {
        order.setOrderId(UUID.randomUUID().toString());
        OrderStatus orderStatus = new OrderStatus(order, "Yolda", "Sipariş alındı");
        producerRabbit.convertAndSendMessageRabbit(orderStatus);
        return orderStatus.getMessage();
    }
}
