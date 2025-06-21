package com.nexora.hirepath.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import com.nexora.hirepath.dto.CategoryRequestDTO;
import com.nexora.hirepath.dto.CategoryResponseDTO;
import com.nexora.hirepath.model.Category;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {

    CategoryResponseDTO toDTO(Category category);

    Category toEntity(CategoryRequestDTO categoryRequestDTO);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCategoryFromDTO(CategoryRequestDTO categoryRequestDTO, @MappingTarget Category category);

}
