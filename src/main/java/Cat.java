/* A sample class that implements the given interfaces.
 */
public class Cat implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Cat() {
        this.maxSpeed = 1;
    }

    @Override
    public String sound() {
        return "Meow!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 3;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
