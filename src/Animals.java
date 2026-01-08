public class Animals extends Entity {

    private String species;
    private int age;
    private boolean vaccinated;
    private double weight;

    public Animals(int id, String name, String createdDate, boolean active,
                   String species, int age, boolean vaccinated, double weight) {

        super(id, name, createdDate, active); // ОБЯЗАТЕЛЬНО
        this.species = species;
        this.age = age;
        this.vaccinated = vaccinated;
        this.weight = weight;
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void celebrateBirthday() {
        age++;
    }

    @Override
    public String work() {
        return "Animal is being treated in the clinic";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", vaccinated=" + vaccinated +
                ", weight=" + weight +
                ", status=" + getStatus() +
                '}';
    }
}
