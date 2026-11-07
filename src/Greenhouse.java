import java.util.ArrayList;
import java.util.List;

public class Greenhouse {
    private final List<GreenhouseElement> plants = new ArrayList<>();

    public Greenhouse add(GreenhouseElement plant) {
        plants.add(plant);
        return this;
    }

    public void accept(GreenhouseVisitor visitor) {
        for (GreenhouseElement plant : plants) {
            plant.accept(visitor);
        }
    }
}
