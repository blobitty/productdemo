package com.floreo.productdemo.repositories;

import com.floreo.productdemo.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
