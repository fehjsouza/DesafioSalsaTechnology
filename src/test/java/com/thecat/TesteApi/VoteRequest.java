package com.thecat.TesteApi;

public class VoteRequest {
    private String image_id;
    private String value;
    private String sub_id;

    public VoteRequest(String image_id, String value, String sub_id) {
        this.image_id = image_id;
        this.value = value;
        this.sub_id = sub_id;
    }

    // Getters and Setters (or Lombok annotations, if you prefer)
    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSub_id() {
        return sub_id;
    }

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }
}
