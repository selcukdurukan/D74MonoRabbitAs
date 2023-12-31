package com.ba.boost.d74monorabbitas.controller;

import com.ba.boost.d74monorabbitas.model.Order;
import com.ba.boost.d74monorabbitas.service.OrderStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderStatusService orderStatusService;

    @PostMapping("/delivery/{restaurantName}")
    public ResponseEntity<String> sendMessage(@RequestBody Order order, @PathVariable(name = "restaurantName") String restaurantName) {
        return ResponseEntity.ok(orderStatusService.makeOrder(order, restaurantName));
    }
}
