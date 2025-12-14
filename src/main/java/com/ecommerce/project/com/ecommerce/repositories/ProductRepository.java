package com.ecommerce.project.com.ecommerce.repositories;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findProductsByCategoryOrderByPriceAsc(Category category, Pageable pageDetails);

    Page<Product> findProductsByProductNameLikeIgnoreCase(String keyword, Pageable pageDetails);

    boolean existsByProductName(String productName);
}
