package com.recursivechaos;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
@DecoratedWith(GameMapperDecorator.class)
public interface GameMapper {

    GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);

    @Mapping(target = "typeCode", ignore = true)
    GameDto entityToDto(GameEntity gameEntity);

    @Mapping(target = "type", ignore = true)
    GameEntity dtoToEntity(GameDto gameDto);

}
