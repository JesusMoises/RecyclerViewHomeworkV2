package com.example.recyclerviewhomeworkv2;

public class ListElement {

    private String descRecipe;
    private String titleRecipe;

    public ListElement(String descRecipe, String titleRecipe) {
        this.descRecipe = descRecipe;
        this.titleRecipe = titleRecipe;
    }

    public String getDescRecipe() {
        return descRecipe;
    }

    public void setDescRecipe(String descRecipe) {
        this.descRecipe = descRecipe;
    }

    public String getTitleRecipe() {
        return titleRecipe;
    }

    public void setTitleRecipe(String titleRecipe) {
        this.titleRecipe = titleRecipe;
    }
}
