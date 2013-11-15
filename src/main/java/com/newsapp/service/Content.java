package com.newsapp.service;

public class Content {

    private final String title;
    private final String text;
    private final String image;

    public Content(String title, String text, String image) {
        this.title = title;
        this.text = text;
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Content [title=" + title + ", text=" + text + ", image=" + image + "]";
    }
    
}
