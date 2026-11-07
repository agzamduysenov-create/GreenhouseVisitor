public class HarvestForecastVisitor implements GreenhouseVisitor {
    private static final int TOMATO_GRAMS_PER_BUSH = 4000;
    private static final int STRAWBERRY_GRAMS_PER_PLANT = 500;
    private static final int CUCUMBER_GRAMS_PER_VINE = 2500;

    private int totalGrams;

    public int getTotalKg() {
        return totalGrams / 1000;
    }

    @Override
    public void visitTomato(Tomato tomato) {
        totalGrams += tomato.getBushes() * TOMATO_GRAMS_PER_BUSH;
    }

    @Override
    public void visitStrawberry(Strawberry strawberry) {
        totalGrams += strawberry.getPlants() * STRAWBERRY_GRAMS_PER_PLANT;
    }

    @Override
    public void visitCucumber(Cucumber cucumber) {
        totalGrams += cucumber.getVines() * CUCUMBER_GRAMS_PER_VINE;
    }
}
