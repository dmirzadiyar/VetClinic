public class VetClinic extends Entity {
    private Animals animal;
    private Client client;


    public VetClinic(int id, String name, Client client, Animals animal) {
        super.setId(id);
        super.setName(name);
        this.client = client;
        this.animal = animal;
    }


    public Animals getAnimal() {
        return animal;
    }

    public Client getClient() {
        return client;
    }
}

