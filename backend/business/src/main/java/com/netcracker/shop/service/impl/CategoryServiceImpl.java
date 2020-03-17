/*
 * Copyright
 */

package com.netcracker.shop.service.impl;

import com.netcracker.shop.db.entity.Category;
import com.netcracker.shop.db.repository.ICategoryRepository;
import com.netcracker.shop.dto.CategoryDto;
import com.netcracker.shop.mapper.ICategoryMapper;
import com.netcracker.shop.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Category service.
 */
@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private final ICategoryMapper mapper;
    @Autowired
    private final ICategoryRepository repository;

    /**
     * Instantiates a new Category service.
     *
     * @param mapper     the mapper
     * @param repository the repository
     */
    public CategoryServiceImpl(ICategoryMapper mapper, ICategoryRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public CategoryDto getById(int id) {
        return mapper
            .toDto(repository.findById(id)
                .orElse(null));
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category f = mapper.fromDto(categoryDto);
        f = repository.save(f);
        categoryDto.setId(f.getId());
        return categoryDto;
    }

    @Override
    public List<CategoryDto> getAll() {
        return mapper.toGetDto(repository.findAll());
    }
}
