import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Food{
    protected boolean vegetarian = false;
    protected float price;
    protected int calories;

    protected List<String> ingredients = new ArrayList<String>();

    public boolean isVegetarian(){
        return this.vegetarian;
    }

    public List getIngredients(){
        return this.ingredients;
    }

    public Sandwich(float price, int calories){
        this.price = price;
        this.calories = calories;
    }

    public Sandwich(float price, int calories, boolean vegetarian){
        this.price = price;
        this.calories = calories;
        this.vegetarian = vegetarian;
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public int getCalories() {
        return 0;
    }
}
