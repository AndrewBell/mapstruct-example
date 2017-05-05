package com.recursivechaos;

public class GameTypeEntity {

    private int id;
    private String shortCode;
    private String description;

    public GameTypeEntity() {
    }

    public GameTypeEntity(int id, String shortCode, String description) {
        this.id = id;
        this.shortCode = shortCode;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
