package com.br.borapraticar.busca.controller;

import com.br.borapraticar.busca.model.Product;

import com.br.borapraticar.busca.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(@RequestBody Product product){
        productService.createProduct(product);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PostMapping("/{id}")
    public void update(@RequestBody Product product,@PathVariable String id){
        productService.updateProduct(product,id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}" )
    public Product findById(@PathVariable String id){
        return productService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/findByName/{name}" )
    public Page<Product> findByName(@PathVariable String name){
        return productService.findByName(name);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/findAll" )
    public Iterable<Product> getAll(){
        return productService.findAll();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
    }
}
