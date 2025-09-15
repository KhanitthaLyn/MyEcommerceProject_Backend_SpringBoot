package com.ecommerce.myecommerceproject.payload;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    @Schema(description = "Category ID for a particular category", example = "111")
    private Long categoryId;
    @Schema(description = "Create Category name", example = "spray")
    private String categoryName;

}
