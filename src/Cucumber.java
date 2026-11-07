public class Cucumber implements GreenhouseElement {
    private final int vines;

    public Cucumber(int vines) {
        this.vines = vines;
    }

    public int getVines() {
        return vines;
    }

    @Override
    public void accept(GreenhouseVisitor visitor) {
        visitor.visitCucumber(this);
    }
}
