public class Veterinarian extends Entity {

    private String specialization;
    private int experienceYears;
    private boolean available;
    private double salary;

    public Veterinarian(int id, String name, String createdDate, boolean active,
                        String specialization, int experienceYears,
                        boolean available, double salary) {

        super(id, name, createdDate, active);
        setSpecialization(specialization);
        setExperienceYears(experienceYears);
        setSalary(salary);
        this.available = available;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 0) {
            throw new IllegalArgumentException("Experience cannot be negative");
        }
        this.experienceYears = experienceYears;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public boolean canPerformSurgery() {
        return experienceYears >= 5;
    }

    public void assignShift() {
        available = false;
    }

    // Override #1
    @Override
    public String work() {
        return "Veterinarian treats animals";
    }

    // Override #2
    @Override
    public String toString() {
        return "Veterinarian{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experience=" + experienceYears +
                ", salary=" + salary +
                ", status=" + getStatus() +
                '}';
    }
}
