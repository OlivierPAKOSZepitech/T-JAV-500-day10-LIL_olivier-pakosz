public abstract class Drink implements Food{
    protected float price;
    protected int calories;

    protected boolean aCan = false;

    public boolean isACan(){
        return this.aCan;}

    public Drink(float price, int calories){
        this.price = price;
        this.calories = calories;
    }
    public Drink(float price, int calories, boolean isACan){
        this.price = price;
        this.calories = calories;
        this.aCan = aCan;
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
