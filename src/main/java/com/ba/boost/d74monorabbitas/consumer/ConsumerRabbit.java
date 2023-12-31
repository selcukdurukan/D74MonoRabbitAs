package com.ba.boost.d74monorabbitas.consumer;

import com.ba.boost.d74monorabbitas.config.rabbit.RabbitConfig;
import com.ba.boost.d74monorabbitas.model.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
public class ConsumerRabbit {

    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void rabbitHandleFromQueue(OrderStatus orderStatus) {
        System.out.println("Consumer'a veri geldi: " + orderStatus.toString());
    }
}
