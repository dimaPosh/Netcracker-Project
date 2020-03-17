/*
 * Copyright
 */

package com.netcracker.shop.mapper;

import com.netcracker.shop.db.entity.Category;
import com.netcracker.shop.dto.CategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * The interface Category mapper.
 */
@Mapper(componentModel = "spring")
public interface ICategoryMapper {

    /**
     * From dto category.
     *
     * @param categoryDtoDto the category dto dto
     * @return the category
     */
    @Mapping(target = "id", ignore = true)
    Category fromDto(CategoryDto categoryDtoDto);

    /**
     * To dto category dto.
     *
     * @param category the category
     * @return the category dto
     */
    CategoryDto toDto(Category category);

    /**
     * To get dto list.
     *
     * @param categories the categories
     * @return the list
     */
    List<CategoryDto> toGetDto(List<Category> categories);
}
