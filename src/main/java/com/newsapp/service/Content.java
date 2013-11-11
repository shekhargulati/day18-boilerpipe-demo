package com.newsapp.service;

public class Content {

    private final String title;
    private final String text;

    public Content(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Content [title=" + title + ", text=" + text + "]";
    }


}
