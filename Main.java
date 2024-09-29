// Objects
// Objects are instances of a class
// Classes are templates of objects
import java.util.*;

public class Main {
  public static void main(String[] args) {

    Meal e = new Meal("Hamburger", "Coke", "Fries", 11.50);
    Meal f = new Meal("Fish Tacos", "Sprite", "Salad", 15.50);
    Meal h = new Meal("Chicken Sandwich", "Water", "Fries", 9.50);

    ArrayList<Meal> meals = new ArrayList<Meal>();
    meals.add(e);
    meals.add(f);
    meals.add(h);

    for(int i = 0; i < meals.size(); i++)
      {
        System.out.println(meals.get(i));
      }
    
}
}

class Meal
{
  private String entree;
  private String drink;
  private String side;
  private double price;

  //constructor, which feeds in values based off of creating an object in the main or other methods.
  public Meal(String e, String d, String s, double p)
  {
    entree = e;
    drink = d;
    side = s;
    price = p;
  }

  //create getters
  public String getEntree()
  {
    return entree;
  }

  public String getDrink()
  {
    return drink;
  }

  public String getSide()
  {
    return side;
  }

  public double getPrice()
  {
    return price;
  }

  //create setters
  
  public void setEntree(String e)
  {
    entree = e;
  }

  public void setDrink(String d)
  {
    drink = d;
  }

  public void setSide(String s)
  {
    side = s;
  }

  public void setPrice(double p)
  {
    price = p;
  }

  //this is a toString method, which is used to print out the object's values.

  public String toString()
  {
    return "Entree: " + entree + "\nDrink: " + drink + "\nSide: " + side + "\nPrice: " + price;
  }
    
}
