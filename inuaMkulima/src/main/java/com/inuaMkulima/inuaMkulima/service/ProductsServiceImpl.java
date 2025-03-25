package com.inuaMkulima.inuaMkulima.service;

import com.inuaMkulima.inuaMkulima.entity.Products;
import com.inuaMkulima.inuaMkulima.repository.ProductsRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductsServiceImpl implements ProductsRepository{
    @Autowired
    private ProductsRepository productsRepository;

    public Products addProduct(Products products) {
            return productsRepository.save(products)
    }

    public List<Products> getAllProducts(){
        List<Products> products = productsRepository.findAll();
        return products;

    }

}
