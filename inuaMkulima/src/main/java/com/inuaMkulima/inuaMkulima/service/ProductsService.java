package com.inuaMkulima.inuaMkulima.service;

import com.inuaMkulima.inuaMkulima.entity.FarmerTransaction;
import com.inuaMkulima.inuaMkulima.entity.Products;

import java.util.List;

public interface ProductsService {

    public Products addProduct(Products products);
    List<Products> getAllProducts();

    FarmerTransaction getBalanceById(Long id);


}
