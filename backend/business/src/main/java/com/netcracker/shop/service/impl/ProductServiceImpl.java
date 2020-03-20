/*
 * Copyright
 */

package com.netcracker.shop.service.impl;

import com.netcracker.shop.db.entity.Product;
import com.netcracker.shop.db.repository.IProductRepository;
import com.netcracker.shop.dto.ProductDto;
import com.netcracker.shop.mapper.IProductMapper;
import com.netcracker.shop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Product service.
 */
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private final IProductMapper mapper;
    @Autowired
    private final IProductRepository repository;


    /**
     * Instantiates a new Product service.
     *
     * @param mapper     the mapper
     * @param repository the repository
     */
    public ProductServiceImpl(IProductMapper mapper,
                              IProductRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public ProductDto getById(int id) {
        return mapper.
            toDto(repository.findById(id).
                orElse(null));
    }

    @Override
    public List<ProductDto> getAll(int category) {
        return mapper.toGetDto(repository.findByCategoryId(category));
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product f = mapper.fromDto(productDto);
        f = repository.save(f);
        productDto.setId(f.getId());
        return productDto;
    }
}
