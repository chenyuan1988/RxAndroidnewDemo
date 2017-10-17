package com.example.chenyuan.rxandroiddemo.entity;

/**
 * Created by chenyuan  on 2017/10/17.
 */

public class CategroyEntity {

    /**
     * id : 1
     * name : sample string 2
     * description : sample string 3
     * imageUrl : sample string 4
     */

    private int id;
    private String name;
    private String description;
    private String imageUrl;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
