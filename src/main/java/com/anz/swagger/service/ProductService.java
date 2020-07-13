package com.anz.swagger.service;


import com.anz.swagger.domain.Product;

public interface ProductService {
  Iterable<Product> listAllProducts();

  Product getProductById(Integer id);

  Product saveProduct(Product product);

  void deleteProduct(Integer id);
}
