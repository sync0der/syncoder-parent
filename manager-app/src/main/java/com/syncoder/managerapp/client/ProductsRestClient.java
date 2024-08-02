package com.syncoder.managerapp.client;

import com.syncoder.managerapp.controller.ProductController;
import com.syncoder.managerapp.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductsRestClient {

    List<Product> findAllProducts();

    Product createProduct(String title, String details);

    Optional<Product> findProduct(int productsId);

    void updateProduct(int productId, String title, String details);

    void deleteProduct(int productId);
}
