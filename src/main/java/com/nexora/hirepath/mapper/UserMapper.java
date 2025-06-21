package com.nexora.hirepath.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import com.nexora.hirepath.dto.RegistrationRequestDTO;
import com.nexora.hirepath.dto.UserResponseDTO;
import com.nexora.hirepath.dto.UserUpdateDTO;
import com.nexora.hirepath.model.User;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserResponseDTO toDTO(User user);

    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "enabled", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    User toEntity(RegistrationRequestDTO registrationRequestDTO);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserFromDTO(UserUpdateDTO userUpdateDTO, @MappingTarget User user);

}
