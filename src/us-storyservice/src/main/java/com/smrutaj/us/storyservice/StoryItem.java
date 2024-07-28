package com.smrutaj.us.storyservice;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "stories")
public class StoryItem {
    @Id
    private String id;
    private String date;
    private String title;
    private String imageUrl;

    public StoryItem(String date, String title, String imageUrl) {
        super();
        this.date = date;
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
