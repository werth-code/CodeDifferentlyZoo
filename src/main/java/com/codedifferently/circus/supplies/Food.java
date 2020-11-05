package com.codedifferently.circus.supplies;

public abstract class Food {
  private FoodType type;

  public Food(){
      this.type = FoodType.UNKNOWN;
  }

  public FoodType getType(){
      return type;
  }
}
