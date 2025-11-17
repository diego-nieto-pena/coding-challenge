package org.api.design.repository

import org.api.design.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface ProductRepository : JpaRepository<Product, Long>
