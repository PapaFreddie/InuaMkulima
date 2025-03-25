package com.inuaMkulima.inuaMkulima.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.inuaMkulima.inuaMkulima.entity.Products;
import com.inuaMkulima.inuaMkulima.service.ProductsServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductsServiceImpl productServiceImpl;
    //Add productApi
        @PostMapping("/api/products")
        public Products addProduct(@RequestBody Products products) {
            productServiceImpl.add(products);
        }
        ////get all products api
    @GetMapping("/api/products")
    public ResponseEntity<List<Products>> getAllProducts(){
        List<Products> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }


    //post farmers record api





}
