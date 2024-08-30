package com.br.borapraticar.busca.repository;

import com.br.borapraticar.busca.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product,String> {
    Page<Product> findByName(String name, Pageable pageable);
}
