/*
 * Copyright
 */

package com.netcracker.shop.mapper;

import com.netcracker.shop.db.entity.Category;
import com.netcracker.shop.dto.CategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * The interface Category mapper.
 */
@Mapper(componentModel = "spring")
public interface ICategoryMapper {
    /**
     * The constant INSTANCE.
     */
    ICategoryMapper INSTANCE = Mappers.getMapper(ICategoryMapper.class);

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
}
