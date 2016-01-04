package com.salad;

import FoodClassification.*;
import com.salad.Salad;
//import static java.util.Comparator.comparing;


/**
 * Created by SunKa on 12/8/15.
 */
public class MakingSalad {

    public static void main(String[] args) {
        String productName = "blank";
        int caloricity = 0;

        //Beef leanBeef = new Beef ("Lean Beef", 111, 0.5);
        Beef simpleBeef = new Beef (productName, caloricity, 0.7);

        //productName = leanBeef.getProductName();

        /*System.out.println(simpleBeef.getProductName() + " " + simpleBeef.getCaloricity() + " " + simpleBeef.getWeight() +
                " " + simpleBeef.getTotalIngridientCaloricity());*/

        Cucumber simpleCucumber = new Cucumber(productName, caloricity, 0.5);
        GreenPeas simpleGreenPeas = new GreenPeas(productName, caloricity, 0.1);
        Potato simplePotato = new Potato(productName, caloricity, 1);
        Turkey simpleTurkey = new Turkey(productName, caloricity, 0.6);

        Salad saladTurkey = new Salad("Turkey salad");
        Salad saladBeef = new Salad("Beef salad");

        saladTurkey.addIngredients(simpleTurkey);
        saladTurkey.addIngredients(simplePotato);
        saladTurkey.addIngredients(simpleGreenPeas);

        saladBeef.addIngredients(simpleBeef);
        saladBeef.addIngredients(simplePotato);
        saladBeef.addIngredients(simpleGreenPeas);
        saladBeef.addIngredients(simpleCucumber);

        System.out.println(saladTurkey.getSaladName() + " caloricity is " + saladTurkey.getSaladCaloricity());
        System.out.println(saladBeef.getSaladName() + " caloricity is " + saladBeef.getSaladCaloricity());

       /* for (Food salad : ingredients) {
            System.out.println(salad.getIngredients());
        }*/

        System.out.println("Unsorted: " + saladBeef.getIngredients());
        saladBeef.sortSaladIngredientsByCaloricity();
        System.out.println("Sorted: " + saladBeef.getIngredients());

        // need to find all ingredients with caloricity between 100 and 500
        saladBeef.getSpecificCaloricityIngredients(100,500);






    }

   /* private void findCaloricity(minCaloricity, maxCaloricity) {
        for (Food salad : saladBeef) {

        }
        return saladCaloricity;
    }*/
}
