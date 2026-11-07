public class Tomato implements GreenhouseElement {
    private final int bushes;

    public Tomato(int bushes) {
        this.bushes = bushes;
    }

    public int getBushes() {
        return bushes;
    }

    @Override
    public void accept(GreenhouseVisitor visitor) {
        visitor.visitTomato(this);
    }
}
