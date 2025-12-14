package com.ecommerce.project.payload.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long productId;
    @NotBlank
    @Size(min = 5, message = "Product name must be at least 5 characters long")
    private String productName;
    @NotBlank
    @Size(min = 7, message = "Product description must be at least 7 characters long")
    private String description;
    private String image;
    private Integer quantity;
    private Double price;
    private Double discount;
    private Double specialPrice;
}
