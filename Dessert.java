public abstract class Dessert implements Food{
    protected float price;
    protected int calories;

    public Dessert(float price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
