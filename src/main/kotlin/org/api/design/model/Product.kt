package org.api.design.model

import jakarta.persistence.*
import java.math.BigDecimal

class Product(
    var id: Long? = null,

    var name: String = "",

    var price: BigDecimal = BigDecimal.ZERO,

    var order: Order? = null
)
