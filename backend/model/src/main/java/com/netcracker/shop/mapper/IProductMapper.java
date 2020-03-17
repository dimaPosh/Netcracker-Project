/*
 * Copyright
 */

package com.netcracker.shop.mapper;

import com.netcracker.shop.db.entity.Product;
import com.netcracker.shop.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * The interface Product mapper.
 */
@Mapper(componentModel = "spring", uses = {ICategoryMapper.class})
public interface IProductMapper {

    /**
     * From dto product.
     *
     * @param productDto the product dto
     * @return the product
     */
    @Mapping(target = "id", ignore = true)
    Product fromDto(ProductDto productDto);

    /**
     * To get dto list.
     *
     * @param products the products
     * @return the list
     */
    List<ProductDto> toGetDto(List<Product> products);

    /**
     * To dto address dto.
     *
     * @param product the product
     * @return the address dto
     */
    ProductDto toDto(Product product);
}
