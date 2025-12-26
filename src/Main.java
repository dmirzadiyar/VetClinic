public class Main {
    public static void main(String[] args) {

        Animals animal1 = new Animals(1, "Dog", "Alabai", true, 20251225);

        Client client1 = new Client("Sapar", 101, "Kabanbai Batyr 60A/13", 870012345);

        VetClinic vetClinic1 = new VetClinic(1, "Arman Vet Clinic", client1, animal1);


        System.out.println("Clinic ID: " + vetClinic1.getId());
        System.out.println("Clinic Name: " + vetClinic1.getName());

        System.out.println("\n--- Animal Info ---");
        System.out.println("Animal ID: " + vetClinic1.getAnimal().getId());
        System.out.println("Animal Name: " + vetClinic1.getAnimal().getAnimalName());
        System.out.println("Species: " + vetClinic1.getAnimal().getSpecies());
        System.out.println("Vaccinated: " + vetClinic1.getAnimal().isVaccinated());

        System.out.println("\n--- Client Info ---");
        System.out.println("Client Name: " + vetClinic1.getClient().getClientName());
        System.out.println("Address: " + vetClinic1.getClient().getAddress());
        System.out.println("Phone: " + vetClinic1.getClient().getPhoneNumber());
    }
}

