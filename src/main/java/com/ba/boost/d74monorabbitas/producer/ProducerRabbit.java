package com.ba.boost.d74monorabbitas.producer;

import com.ba.boost.d74monorabbitas.model.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static com.ba.boost.d74monorabbitas.config.rabbit.RabbitConfig.*;
@Service
public class ProducerRabbit {

    private final RabbitTemplate rabbitTemplate;


    public ProducerRabbit(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void convertAndSendMessageRabbit(OrderStatus orderStatus) {
        System.out.println("Producer'a veri geldi.");
        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, orderStatus);
    }
}
