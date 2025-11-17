package org.api.design.repository

import org.api.design.model.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface OrderRepository : JpaRepository<Order, Long>
