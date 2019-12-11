package com.stiick.stockback.controller;


import com.stiick.stockback.entity.Product;
import com.stiick.stockback.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "product")
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Product findById(@PathVariable String id) throws Exception {
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.orElseThrow(Exception::new);
    }

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Product> findAll() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Product update(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable String id) {
        productRepository.deleteById(id);
    }
}
