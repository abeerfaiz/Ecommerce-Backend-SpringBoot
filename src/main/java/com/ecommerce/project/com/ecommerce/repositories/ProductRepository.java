package com.ecommerce.project.com.ecommerce.repositories;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findProductsByCategoryOrderByPriceAsc(Category category);

    List<Product> findProductsByProductNameLikeIgnoreCase(String keyword);

    boolean existsByProductName(String productName);
}
