package com.salad;

import FoodClassification.Food;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * Created by SunKa on 12/13/15.
 */
public class Salad {
    private String saladName;
    private double saladCaloricity;
    private int ingredientCaloricity;

    public List<Food> ingredients = new ArrayList<Food>();

    public Salad(String saladName) {
        this.saladName = saladName;
    }

    public void addIngredients(Food food) {
        ingredients.add(food);
    }

    public String getSaladName() {
        return saladName;
    }

    public void setSaladName(String saladName) {
        this.saladName = saladName;
    }

    public List<Food> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Food> ingredients) {
        this.ingredients = ingredients;
    }

    // to calculate salad caloricity
    protected double getSaladCaloricity() {
        for (Food salad : ingredients) {
            saladCaloricity += salad.getTotalIngridientCaloricity();
        }
        return saladCaloricity;
    }

    /*public void setSaladCaloricity(int saladCaloricity) {
        this.saladCaloricity = saladCaloricity;
    }*/

    // to sort salad ingredients by caloricity - TBD, how to print sorted ingredients from Main
    protected void sortSaladIngredientsByCaloricity() {
        Collections.sort(ingredients, comparing(Food ::getCaloricity));
    }
    // to find ingredients in some caloricity range  - TBD, some better implementation should exists :)
    protected void getSpecificCaloricityIngredients(int minCaloricity, int maxCaloricity) {
        for (Food salad : ingredients) {
            ingredientCaloricity = salad.getCaloricity();
            if (minCaloricity<=ingredientCaloricity && maxCaloricity>=ingredientCaloricity)
                System.out.println("Salad ingredient in caloricity range: " + salad.getProductName());
        }
    }
}
