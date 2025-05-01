package com.webservices.courseudemy.dto;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import com.webservices.courseudemy.entities.Order;
import com.webservices.courseudemy.entities.enums.OrderStatus;

public record OrderDTO(Long id,
	    Instant moment,
	    OrderStatus orderStatus,
	    List<OrderItemDTO> items
	    ) {

	public static OrderDTO fromEntity(Order order) {
        return new OrderDTO(
            order.getId(),
            order.getMoment(),
            order.getOrderStatus(),           
            order.getItems().stream()
                .map(OrderItemDTO::fromEntity)
                .collect(Collectors.toList())
            
        );
	}
}
