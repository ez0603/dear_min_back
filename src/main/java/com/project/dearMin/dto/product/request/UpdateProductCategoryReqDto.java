package com.project.dearMin.dto.product.request;

import com.project.dearMin.entity.product.Category;
import lombok.Data;

@Data
public class UpdateProductCategoryReqDto {
    private int categoryId;
    private String categoryName;

    public Category toEntity() {
        return Category.builder()
                .categoryId(categoryId)
                .categoryName(categoryName)
                .build();
    }
}