public class SoftBread extends Bread {
    public SoftBread() {
        super(1.200f, 500);
        this.bakingTime = 30;
    }

    public static void main(String[] args) {
        Food bread = new SoftBread();
        System.out.println(" The softbread costs " + bread.getPrice() + " euros and contains " + bread.getCalories() + " calories.");
    }
}
