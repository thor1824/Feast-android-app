package com.example.feast.core.entities;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;


public class UserRecipe implements IRecipe, Serializable {


    private ArrayList<Ingredient> ingredients;
    private long estimatedTime;
    private String id;
    private String name;
    private String userId;
    private String imageUrl;


    public UserRecipe(ArrayList<Ingredient> listOfIngredients, String id, long time, String name, String userId, String imageUrl) {

        this.estimatedTime = time;
        this.ingredients = listOfIngredients;
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;

        this.userId = userId;
    }

    public UserRecipe(ArrayList<Ingredient> listOfIngredients, long time, String name, String userId, String imageUrl) {

        this.estimatedTime = time;
        this.ingredients = listOfIngredients;
        this.name = name;
        this.userId = userId;
        this.imageUrl = imageUrl;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;

    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public long getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(long estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @NonNull
    @Override
    public String toString() {
        return "id: " + id + " name: " + name;
    }
}

