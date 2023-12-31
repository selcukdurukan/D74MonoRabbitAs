package com.ba.boost.d74monorabbitas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderStatus implements Serializable {

    private Order order;
    private String status;
    private String message;

}
