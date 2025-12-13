package com.ecommerce.project.service;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.payload.product.ProductDTO;
import com.ecommerce.project.payload.product.ProductResponse;

public interface ProductService {
    ProductDTO addProduct(Product product, Long categoryId);

    ProductResponse getAllProducts();

    ProductResponse searchProductsByCategory(Long categoryId);

    ProductResponse searchProductsByKeyword(String keyword);

    ProductDTO updateProduct(Product product, Long productId);

    ProductDTO deleteProduct(Long productId);
}
