public class WaterNeedVisitor implements GreenhouseVisitor {
    private static final int TOMATO_ML_PER_BUSH = 500;
    private static final int STRAWBERRY_ML_PER_PLANT = 300;
    private static final int CUCUMBER_ML_PER_VINE = 400;

    private int totalMl;

    public int getTotalMl() {
        return totalMl;
    }

    @Override
    public void visitTomato(Tomato tomato) {
        totalMl += tomato.getBushes() * TOMATO_ML_PER_BUSH;
    }

    @Override
    public void visitStrawberry(Strawberry strawberry) {
        totalMl += strawberry.getPlants() * STRAWBERRY_ML_PER_PLANT;
    }

    @Override
    public void visitCucumber(Cucumber cucumber) {
        totalMl += cucumber.getVines() * CUCUMBER_ML_PER_VINE;
    }
}
