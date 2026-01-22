package model;

public class Animals extends Entity {
    private String species;
    private int age;
    private boolean vaccinated;
    private double weight;

    public Animals(int id, String name, String createdDate, boolean active,
                   String species, int age, boolean vaccinated, double weight) {
        super(id, name, createdDate, active);
        setSpecies(species);
        setAge(age);
        this.vaccinated = vaccinated;
        this.weight = weight;
    }

    public void setSpecies(String species) {
        if (species == null || species.isBlank()) {
            throw new IllegalArgumentException("Species cannot be empty");
        }
        this.species = species;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    @Override
    public String work() {
        return "Animal is being treated";
    }
}
