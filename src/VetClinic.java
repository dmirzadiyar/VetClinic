public class VetClinic {

    private String name;
    private int animalsCount;

    public VetClinic(String name) {
        this.name = name;
        animalsCount = 0;
    }

    public void admitAnimal() {
        animalsCount++;
    }

    public boolean canAcceptMoreAnimals() {
        return animalsCount < 50;
    }

    public int getAnimalsCount() {
        return animalsCount;
    }
}
