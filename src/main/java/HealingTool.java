public class HealingTool {
    private String name;
    private double healingAmount;

    public String getName() {
        return name;
    }

    public double getHealingAmount() {
        return healingAmount;
    }

    public HealingTool(String name, double healingAmount) {
        this.name = name;
        this.healingAmount = healingAmount;
    }
}
