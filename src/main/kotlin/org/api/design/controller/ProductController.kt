package org.api.design.controller

import org.api.design.model.Product
import org.api.design.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

class ProductController(private val productService: ProductService) {

}
