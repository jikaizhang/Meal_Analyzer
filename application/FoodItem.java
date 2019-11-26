/**
 * Filename: FoodItem.java
 * 
 * Project: Meal-Analyzer
 * 
 * Authors: Shifan Zhou, Lixing Cheng, Kaidong Lin, Yiting Wang, Jikai Zhang
 *
 * Version: 1.0
 * 
 * Credits: none
 * 
 * Bugs: none
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class represents a food item with all its properties.
 * 
 * @author aka
 */
public class FoodItem {
  // The name of the food item.
  private String name;

  // The id of the food item.
  private String id;

  // Map of nutrients and value.
  private HashMap<String, Double> nutrients;

  /**
   * Constructor
   * 
   * @param name name of the food item
   * @param id unique id of the food item
   */
  public FoodItem(String id, String name) {
    // TODO : Complete
    this.id = id;
    this.name = name;
    nutrients = new HashMap<String, Double>();
    nutrients.put("calories", (double) 0);
    nutrients.put("fat", (double) 0);
    nutrients.put("carbohydrate", (double) 0);
    nutrients.put("fiber", (double) 0);
    nutrients.put("protein", (double) 0);
  }

  /**
   * Gets the name of the food item
   * 
   * @return name of the food item
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the unique id of the food item
   * 
   * @return id of the food item
   */
  public String getID() {
    return id;
  }

  /**
   * Gets the nutrients of the food item
   * 
   * @return nutrients of the food item
   */
  public HashMap<String, Double> getNutrients() {
    return nutrients;
  }

  /**
   * Adds a nutrient and its value to this food. If nutrient already exists, updates its value.
   */
  public void addNutrient(String name, double value) {
    nutrients.replace(name, value);
    // Seems like both cases have the same code
  }

  /**
   * Returns the value of the given nutrient for this food item. If not present, then returns 0.
   */
  public double getNutrientValue(String name) {
    if (nutrients.containsKey(name)) {
      return nutrients.get(name);
    }
    return 0;
  }
}
