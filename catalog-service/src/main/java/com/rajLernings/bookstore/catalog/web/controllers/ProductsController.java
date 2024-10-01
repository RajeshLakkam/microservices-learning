package com.rajLernings.bookstore.catalog.web.controllers;

import com.rajLernings.bookstore.catalog.domain.Product.PagedResults;
import com.rajLernings.bookstore.catalog.domain.Product.Product;
import com.rajLernings.bookstore.catalog.domain.Product.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
class ProductsController {

    private final ProductService productService;

    ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    PagedResults<Product> getProducts(@RequestParam(name = "page", defaultValue = "1") int pageNo) {
        return productService.getProducts(pageNo);
    }

    @GetMapping("/{code}")
    ResponseEntity<Product> getProductByCode(@PathVariable(name = "code") String code) {
        return ResponseEntity.ok(productService.getProductByCode(code));
    }
}
