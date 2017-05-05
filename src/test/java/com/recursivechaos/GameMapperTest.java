package com.recursivechaos;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class GameMapperTest {

    @Test
    public void dtoToEntityTest() throws Exception {
        GameDto gameDto = new GameDto(1, "Twilight Imperium", "BG");

        GameEntity gameEntity = GameMapper.INSTANCE.dtoToEntity(gameDto);

        assertNotNull(gameEntity);
        assertEquals(gameDto.getId(), gameEntity.getId());
        assertEquals(gameDto.getName(), gameEntity.getName());
        assertEquals(gameDto.getTypeCode(), gameEntity.getType().getShortCode());
    }

    @Test
    public void entityToDtoTest() throws Exception {
        GameEntity entity = new GameEntity(1, "Twilight Imperium",
                new GameTypeEntity(1, "BG", "Board Game"));

        GameDto dto = GameMapper.INSTANCE.entityToDto(entity);

        assertNotNull(dto);
        assertEquals(entity.getId(), dto.getId());
        assertEquals(entity.getName(), dto.getName());
        assertEquals(entity.getType().getShortCode(), dto.getTypeCode());
    }
}