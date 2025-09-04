package com.ecommerce.myecommerceproject.service;

import com.ecommerce.myecommerceproject.model.Category;
import com.ecommerce.myecommerceproject.payload.CategoryDTO;
import com.ecommerce.myecommerceproject.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
