package com.minhtri.spring.services;

import com.minhtri.spring.models.Product;
import com.minhtri.spring.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    public List<Product> getAll() {
        return repository.getAll();
    }

    public Product getById(int id) {
        return repository.getById(id);
    }

    public void insert(Product input) {
        input.setId(new Random().nextInt(1000));
        repository.insert(input);
    }

    public void update(Product input) {
        repository.update(input);
    }

    public void delete(int id) {
        repository.delete(id);
    }
}
