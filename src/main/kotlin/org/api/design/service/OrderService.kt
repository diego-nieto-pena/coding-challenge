package org.api.design.service

import org.api.design.model.Order
import org.springframework.stereotype.Service

class OrderService {

    fun getAllOrders(): List<Order> {
        // TODO: Implement
        return emptyList()
    }

    fun getOrderById(id: Long): Order? {
        // TODO: Implement
        return null
    }

    fun createOrder(order: Order): Order {
        // TODO: Implement
        return order
    }

    fun updateOrder(id: Long, order: Order): Order? {
        // TODO: Implement
        return null
    }

    fun deleteOrder(id: Long) {
        // TODO: Implement
    }
}
