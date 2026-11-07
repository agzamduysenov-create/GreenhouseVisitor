public class Main {
    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse()
                .add(new Tomato(10))
                .add(new Strawberry(20))
                .add(new Cucumber(6));

        WaterNeedVisitor water = new WaterNeedVisitor();
        greenhouse.accept(water);
        System.out.println("Total water needed: " + water.getTotalMl() + " ml");

        HarvestForecastVisitor harvest = new HarvestForecastVisitor();
        greenhouse.accept(harvest);
        System.out.println("Expected harvest: " + harvest.getTotalKg() + " kg");
    }
}
