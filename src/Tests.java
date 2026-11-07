public class Tests {
    private static int checks = 0;

    public static void main(String[] args) {
        waterForEachPlantType();
        harvestForEachPlantType();
        wholeGreenhouse();
        visitorsDoNotShareResults();
        System.out.println("All tests passed (" + checks + " checks)");
    }

    private static void waterForEachPlantType() {
        WaterNeedVisitor visitor = new WaterNeedVisitor();
        new Tomato(2).accept(visitor);
        new Strawberry(3).accept(visitor);
        new Cucumber(1).accept(visitor);
        assertEquals(2300, visitor.getTotalMl(), "water for 2 tomatoes + 3 strawberries + 1 cucumber");
    }

    private static void harvestForEachPlantType() {
        HarvestForecastVisitor visitor = new HarvestForecastVisitor();
        new Tomato(2).accept(visitor);
        new Strawberry(4).accept(visitor);
        new Cucumber(2).accept(visitor);
        assertEquals(15, visitor.getTotalKg(), "harvest for 2 tomatoes + 4 strawberries + 2 cucumbers");
    }

    private static void wholeGreenhouse() {
        Greenhouse greenhouse = sampleGreenhouse();
        WaterNeedVisitor water = new WaterNeedVisitor();
        HarvestForecastVisitor harvest = new HarvestForecastVisitor();
        greenhouse.accept(water);
        greenhouse.accept(harvest);
        assertEquals(13400, water.getTotalMl(), "water for the whole greenhouse");
        assertEquals(65, harvest.getTotalKg(), "harvest for the whole greenhouse");
    }

    private static void visitorsDoNotShareResults() {
        WaterNeedVisitor first = new WaterNeedVisitor();
        WaterNeedVisitor second = new WaterNeedVisitor();
        new Tomato(1).accept(first);
        assertEquals(500, first.getTotalMl(), "first visitor counted the tomato");
        assertEquals(0, second.getTotalMl(), "second visitor stayed empty");
    }

    private static Greenhouse sampleGreenhouse() {
        return new Greenhouse()
                .add(new Tomato(10))
                .add(new Strawberry(20))
                .add(new Cucumber(6));
    }

    private static void assertEquals(int expected, int actual, String message) {
        checks++;
        if (expected != actual) {
            throw new AssertionError(message + ": expected " + expected + " but was " + actual);
        }
    }
}
