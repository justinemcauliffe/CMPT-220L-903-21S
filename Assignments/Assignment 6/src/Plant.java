public class Plant {
    boolean needsWatering = true;
    String plantFamily;
    String name;


    public Plant(String name, String plantFamily, boolean needsWatering) {
        this.name = name;
        this.plantFamily = plantFamily;
        this.needsWatering = needsWatering;
    }

    public void wateringInstructions() {
        System.out.println("Water Every Day");
    }

    public void sunLightRequirements() {
        System.out.println("Indirect sunlight");
    }

}
