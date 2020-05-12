package com.example.feast.Models;

import java.io.Serializable;
import java.util.ArrayList;

public class UserRecipes implements Serializable {

    private ArrayList<Ingredient> ingredients;
    private long estimatedTime;
    private String id;
    private String name;
    private String userId;


    public UserRecipes(ArrayList<Ingredient> listOfIngredients, String id, long time, String name, String userId) {
        this.estimatedTime = time;
        this.ingredients = listOfIngredients;
        this.id = id;
        this.name = name;
        this.userId = userId;
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


}

