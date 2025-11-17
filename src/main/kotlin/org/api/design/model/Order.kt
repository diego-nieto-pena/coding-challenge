package org.api.design.model

import jakarta.persistence.*
import java.math.BigDecimal

class Order(
    var id: Long? = null,

    var customerName: String = "",

    var products: MutableList<Product> = mutableListOf(),

    var total: BigDecimal = BigDecimal.ZERO
)
