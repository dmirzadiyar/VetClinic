public class Animals extends Entity {
    private String species;
    private boolean isVaccinated;
    private int lastVisit;


    public Animals(int id, String name, String species, boolean isVaccinated, int lastVisit) {
        super.setId(id);
        super.setName(name);
        this.species = species;
        this.isVaccinated = isVaccinated;
        this.lastVisit = lastVisit;
    }





    public void setSpecies(String species) {
        this.species = species;
    }

    public void setVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public void setLastVisit(int lastVisit) {
        this.lastVisit = lastVisit;
    }


    public int getId() {
        return super.getId();
    }

    public String getAnimalName() {
        return super.getName();
    }

    public String getSpecies() {
        return species;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public int getLastVisit() {
        return lastVisit;
    }


    public void printAnimalHistory() {
        System.out.println("Animal History:");
        System.out.println("Name: " + getAnimalName());
        System.out.println("Species: " + species);
        System.out.println("Is Vaccinated: " + isVaccinated);
        System.out.println("Last Visit: " + lastVisit);
    }
}
