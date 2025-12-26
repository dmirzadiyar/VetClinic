public class Main {

    public static void main(String[] args) {

        VetClinic clinic = new VetClinic(
                "Happy Paws Vet Clinic",
                "Almaty, Abaya 25",
                "+7-777-123-45-67",
                12
        );

        Animals animal1 = new Animals(
                1,
                "Buddy",
                "2025-01-10",
                true,
                "Dog",
                3,
                false,
                12.5
        );

        System.out.println("=== Vet Clinic Info ===");
        System.out.println(clinic);
        System.out.println();

        System.out.println("=== Animal Info ===");
        System.out.println(animal1);

        System.out.println();
        System.out.println("Needs vaccination: " + animal1.needsVaccination());

        animal1.setVaccinated(true);
        animal1.celebrateBirthday();
        animal1.setWeight(13.2);

        clinic.admitAnimal();

        System.out.println();
        System.out.println("=== Updated Info ===");
        System.out.println(animal1);
        System.out.println("Clinic can accept more animals: " + clinic.canAcceptMoreAnimals());
        System.out.println("Total animals in clinic: " + clinic.getAnimalsCount());
    }
}


