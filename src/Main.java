import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Entity> people = new ArrayList<>();

        while (true) {
            System.out.println("\n--- VET CLINIC MENU ---");
            System.out.println("1. Add Veterinarian");
            System.out.println("2. Add Client");
            System.out.println("3. View All");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Specialization: ");
                String spec = scanner.nextLine();

                System.out.print("Experience years: ");
                int exp = scanner.nextInt();

                System.out.print("Salary: ");
                double salary = scanner.nextDouble();

                people.add(new Veterinarian(
                        id, name, "2025-01-01", true,
                        spec, exp, true, salary
                ));

            } else if (choice == 2) {
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Address: ");
                String address = scanner.nextLine();

                System.out.print("Phone: ");
                int phone = scanner.nextInt();

                people.add(new Client(
                        id, name, "2025-01-01", true,
                        address, phone
                ));

            } else if (choice == 3) {

                for (Entity e : people) {
                    System.out.println(e);
                    System.out.println("Work: " + e.work());

                    // instanceof + casting
                    if (e instanceof Veterinarian) {
                        Veterinarian v = (Veterinarian) e;
                        System.out.println("Can perform surgery: " + v.canPerformSurgery());
                    }
                }

            } else if (choice == 4) {
                break;
            }
        }
    }
}
