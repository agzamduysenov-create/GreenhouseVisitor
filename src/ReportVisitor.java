public class ReportVisitor implements GreenhouseVisitor {
    private final StringBuilder report = new StringBuilder();

    public String getReport() {
        return report.toString();
    }

    @Override
    public void visitTomato(Tomato tomato) {
        report.append("Tomato: ").append(tomato.getBushes()).append(" bushes\n");
    }

    @Override
    public void visitStrawberry(Strawberry strawberry) {
        report.append("Strawberry: ").append(strawberry.getPlants()).append(" plants\n");
    }

    @Override
    public void visitCucumber(Cucumber cucumber) {
        report.append("Cucumber: ").append(cucumber.getVines()).append(" vines\n");
    }
}
