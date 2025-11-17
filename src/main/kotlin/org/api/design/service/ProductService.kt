package org.api.design.service

import org.api.design.model.Product
import org.springframework.stereotype.Service

@Service
class ProductService {

    fun getAllProducts(): List<Product> {
        // TODO: Implement
        return emptyList()
    }

    fun getProductById(id: Long): Product? {
        // TODO: Implement
        return null
    }

    fun createProduct(product: Product): Product {
        // TODO: Implement
        return product
    }

    fun updateProduct(id: Long, product: Product): Product? {
        // TODO: Implement
        return null
    }

    fun deleteProduct(id: Long) {
        // TODO: Implement
    }
}
