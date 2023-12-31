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
public class Order implements Serializable {

    private String orderId;
    private String name;
    private Integer quantity;
    private Double price;

}
