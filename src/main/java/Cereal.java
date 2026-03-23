/**
 * Cereal.java
 *
 * @author – Kennick Oldenkamp
 * @author – 8AM
 *
 */
public class Cereal
{
    // private instance variables to hold info about a cereal from the data set
    // the name, calories, fiber, carbohydrates, and cups
    String name;
    int calories;
    int fiber;
    int carbohydrates;
    double cups;

    // constructor that creates a cereal object
    public Cereal(String name, int calories, int fiber, int carbohydrates, double cups){
        this.name = name;
        this.calories = calories;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.cups = cups;
    }

    public String getName(){
        return name;
    }

    public int getCalories(){
        return calories;
    }
    public int getFiber(){
        return fiber;
    }
    public int getCarbs(){
        return carbohydrates;
    }
    public double getCups(){
        return cups;
    }

    // accessor methods for each instance variable

    /* toString method returns the values stored in the instance variables
       concatenated in a sentence starting with "Cereal: " */

       public String toString(){
        return "Cereal: "+name+", Calories: "+calories+", Fiber: "+fiber+", Carbs: "+carbohydrates+", Cups: "+cups;
       }

}


