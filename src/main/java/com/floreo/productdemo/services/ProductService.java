package com.floreo.productdemo.services;

import com.floreo.productdemo.commands.ProductForm;
import com.floreo.productdemo.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
