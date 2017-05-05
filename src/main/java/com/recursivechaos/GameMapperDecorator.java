package com.recursivechaos;


public abstract class GameMapperDecorator implements GameMapper {

    private final GameMapper delegate;

    public GameMapperDecorator(GameMapper delegate) {
        this.delegate = delegate;
    }

    @Override
    public GameDto entityToDto(GameEntity gameEntity) {
        GameDto dto = delegate.entityToDto(gameEntity);
        dto.setTypeCode(gameEntity.getType().getShortCode());
        return dto;
    }

    @Override
    public GameEntity dtoToEntity(GameDto dto) {
        GameEntity entity = delegate.dtoToEntity(dto);
        //Non-trivial mapping can be done here
        entity.setType(new GameTypeEntity(1, "BG", "Board Game"));
        return entity;
    }
}
