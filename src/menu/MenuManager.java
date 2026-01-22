package menu;

import model.*;
import exception.MenuInputException;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager implements Menu {

    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Entity> entities = new ArrayList<>();

    @Override
    public void displayMenu() {
        System.out.println("""
                --- VET CLINIC MENU ---
                1. Add Veterinarian
                2. Add Client
                3. View All
                4. Exit
                """);
    }

    @Override
    public void run() {
        while (true) {
            try {
                displayMenu();
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> addVeterinarian();
                    case 2 -> addClient();
                    case 3 -> viewAll();
                    case 4 -> { return; }
                    default -> throw new MenuInputException("Invalid menu option");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            } catch (IllegalArgumentException | MenuInputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void addVeterinarian() {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Specialization: ");
        String spec = scanner.nextLine();
        System.out.print("Experience years: ");
        int exp = Integer.parseInt(scanner.nextLine());
        System.out.print("Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        entities.add(new Veterinarian(id, name, "2026-01-01", true, spec, exp, true, salary));
    }

    private void addClient() {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Phone: ");
        int phone = Integer.parseInt(scanner.nextLine());

        entities.add(new Client(id, name, "2026-01-01", true, address, phone));
    }

    private void viewAll() {
        for (Entity e : entities) {
            System.out.println(e);
            System.out.println("Work: " + e.work());
            if (e instanceof Manageable m) {
                System.out.println("Available: " + m.isAvailable());
            }
        }
    }
}
