package com.wordpress.jonyonandroidcraftsmanship.customlistbaseadapterdemo;

public class SingleRow {
    private int image = 0;
    private String title = null;
    private String description = null;

    public SingleRow(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
