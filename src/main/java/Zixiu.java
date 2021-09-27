/* zixiu class that implements the given interfaces.
 */
public class Zixiu implements Tradable {
    private int num;

    public Zixiu(){
        this.num = 1;
    }
    @Override
    public int getPrice() {
        return 100;
    }
}
