package com.ecommerce.project.service;

import com.ecommerce.project.payload.category.CategoryDTO;
import com.ecommerce.project.payload.category.CategoryResponse;

public interface CategoryService {

    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
    CategoryDTO createCategory(CategoryDTO category);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
