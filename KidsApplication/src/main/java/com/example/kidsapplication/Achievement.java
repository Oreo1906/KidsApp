package com.example.kidsapplication;

import javafx.scene.image.Image;

public class Achievement {
    private String title;
    private String description;
    private boolean isUnlocked;
    private Image icon;
    private int points;

    public Achievement(String title, String description, Image icon, int points) {
        this.title = title;
        this.description = description;
        this.icon = icon;
        this.points = points;
        this.isUnlocked = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isUnlocked() {
        return isUnlocked;
    }

    public void unlock() {
        this.isUnlocked = true;
    }

    public Image getIcon() {
        return icon;
    }

    public int getPoints() {
        return points;
    }
}