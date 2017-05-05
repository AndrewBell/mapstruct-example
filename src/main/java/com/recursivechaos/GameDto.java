package com.recursivechaos;

public class GameDto {

    private int id;
    private String name;
    private String typeCode;

    public GameDto() {
    }

    public GameDto(int id, String name, String typeCode) {
        this.id = id;
        this.name = name;
        this.typeCode = typeCode;
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

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
}
