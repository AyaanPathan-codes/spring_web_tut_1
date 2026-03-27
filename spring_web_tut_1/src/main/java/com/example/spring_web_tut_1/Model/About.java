package com.example.spring_web_tut_1.Model;

public class About {

    private String name;
    private int publishedSince;

    public String getName() {
        return name;
    }

    public About(String name, int publishedSince) {
        this.name = name;
        this.publishedSince = publishedSince;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishedSince() {
        return publishedSince;
    }

    public void setPublishedSince(int publishedSince) {
        this.publishedSince = publishedSince;
    }
}
