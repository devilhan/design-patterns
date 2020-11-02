package com.com.devil.runoob.builder;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class BuilderPatternDemo {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost : "+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("-----------------");
        System.out.println("Non-veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost : "+nonVegMeal.getCost());
    }
}
