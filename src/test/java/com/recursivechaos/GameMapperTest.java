package com.recursivechaos;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class GameMapperTest {

    @Test
    public void mapTest() throws Exception {
        GameDto gameDto = new GameDto(1, "Twilight Imperium");

        GameEntity gameEntity = GameMapper.INSTANCE.dtoToEntity(gameDto);

        assertNotNull(gameEntity);
        assertEquals(gameDto.getId(), gameEntity.getId());
        assertEquals(gameDto.getName(), gameEntity.getName());
    }


}