package com.example.notes;

public class Note {
    private String title;
    private String description;
    private String price;
    private String link;

    public Note(String title, String description, String price, String link) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.link = link;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getPrice() { return price; }
    public String getLink() { return link; }
}
