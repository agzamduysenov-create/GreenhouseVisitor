public class Strawberry implements GreenhouseElement {
    private final int plants;

    public Strawberry(int plants) {
        this.plants = plants;
    }

    public int getPlants() {
        return plants;
    }

    @Override
    public void accept(GreenhouseVisitor visitor) {
        visitor.visitStrawberry(this);
    }
}
