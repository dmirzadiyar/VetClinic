public class Animals extends Entity {

    private String species;
    private int age;
    private boolean vaccinated;
    private double weight;

    public Animals(int id, String name, String createdDate, boolean active,
                  String species, int age, boolean vaccinated, double weight) {
        super(id, name, createdDate, active);
        this.species = species;
        this.age = age;
        this.vaccinated = vaccinated;
        this.weight = weight;
    }

    public Animals() {
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
        this.age = age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void celebrateBirthday() {
        this.age++;
    }

    public boolean needsVaccination() {
        return !vaccinated;
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

