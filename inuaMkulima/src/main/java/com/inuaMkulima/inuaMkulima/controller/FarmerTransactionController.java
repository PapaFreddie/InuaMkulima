package com.inuaMkulima.inuaMkulima.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.inuaMkulima.inuaMkulima.entity.FarmerTransaction;
import com.inuaMkulima.inuaMkulima.entity.Products;
import com.inuaMkulima.inuaMkulima.service.ProductsServiceImpl;

@RestController
@RequestMapping("/api")
public class FarmerTransactionController {
    private ProductsServiceImpl productServiceImpl;

    //post farmer transaction api
    @PostMapping("/api/transactions")
    public Products addProduct(@RequestBody FarmerTransaction farmerTransaction) {
        productServiceImpl.add(farmerTransaction);
    }


    //retrieve farmer balance wallet
    @GetMapping("/api/wallet/{id}")
    public ResponseEntity<FarmerTransaction>findById(@PathVariable("id") Long id){
        FarmerTransaction farmerTransaction = productServiceImpl.findById(id);
        return ResponseEntity.ok(farmerTransaction);
    }


}
