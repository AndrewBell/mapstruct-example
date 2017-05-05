package com.recursivechaos;

public class GameEntity {

    private int id;
    private String name;
    private GameTypeEntity type;

    public GameEntity() {
    }

    public GameEntity(int id, String name, GameTypeEntity type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameTypeEntity getType() {
        return type;
    }

    public void setType(GameTypeEntity type) {
        this.type = type;
    }
}
