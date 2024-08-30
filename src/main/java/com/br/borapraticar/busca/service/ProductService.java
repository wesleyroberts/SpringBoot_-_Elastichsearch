package com.br.borapraticar.busca.service;

import com.br.borapraticar.busca.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    void createProduct(Product product);
    void updateProduct(Product product, String id);
    Product findById(String id);
    Iterable<Product> findAll();
    void deleteProduct(String id);
    Page<Product> findByName(String name);
}
