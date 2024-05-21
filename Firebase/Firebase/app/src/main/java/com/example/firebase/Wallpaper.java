package com.example.firebase;

public class Wallpaper {
    private String title;
    private String imageUrl;

    public Wallpaper() {
        // Default constructor required for calls to DataSnapshot.getValue(Wallpaper.class)
    }

    public Wallpaper(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}

