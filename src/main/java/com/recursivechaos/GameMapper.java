package com.recursivechaos;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Ignore
@Mapper
public interface GameMapper {

    GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);

    GameDto entityToDto(GameEntity gameEntity);

    GameEntity dtoToEntity(GameDto gameDto);

}
