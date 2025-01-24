package org.example.DTO;

public class UpdateDTO {

    private int id;
    private String attribute;
    private String value;


    public UpdateDTO(int id, String attribute, String value) {
        this.id = id;
        this.attribute = attribute;
        this.value = value;
    }

    public UpdateDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

