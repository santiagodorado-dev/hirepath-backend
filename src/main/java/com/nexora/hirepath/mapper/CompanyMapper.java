package com.nexora.hirepath.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.nexora.hirepath.dto.CompanyRegistrationRequestDTO;
import com.nexora.hirepath.dto.CompanyResponseDTO;
import com.nexora.hirepath.dto.CompanyUpdateRequestDTO;
import com.nexora.hirepath.model.Company;

@Mapper(componentModel = "spring", uses = { UserMapper.class })
public interface CompanyMapper {

    @Mapping(source = "user.email", target = "email")
    @Mapping(source = "user.firstName", target = "firstName")
    @Mapping(source = "user.lastName", target = "lastName")
    @Mapping(source = "user.enabled", target = "enabled")
    @Mapping(source = "user.createdAt", target = "createdAt")
    CompanyResponseDTO toDTO(Company company);

    @Mapping(target = "companyId", ignore = true)
    @Mapping(target = "user", ignore = true)
    Company toEntity(CompanyRegistrationRequestDTO companyRegistrationRequestDTO);

    @Mapping(target = "companyId", ignore = true)
    @Mapping(source = "firstName", target = "user.firstName")
    @Mapping(source = "lastName", target = "user.lastName")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCompanyFromDTO(CompanyUpdateRequestDTO companyUpdateRequestDTO, @MappingTarget Company company);

}
