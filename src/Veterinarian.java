public class Veterinarian extends Entity {

    private String specialization;
    private int experienceYears;
    private boolean available;
    private double salary;

    public Veterinarian(int id, String name, String createdDate, boolean active,
                        String specialization, int experienceYears,
                        boolean available, double salary) {
        super(id, name, createdDate, active);
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.available = available;
        this.salary = salary;
    }

    public Veterinarian() {
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /* ===== Additional logic methods ===== */

    public boolean canPerformSurgery() {
        return experienceYears >= 5;
    }

    public void assignShift() {
        this.available = false;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experienceYears=" + experienceYears +
                ", available=" + available +
                ", salary=" + salary +
                ", status=" + getStatus() +
                '}';
    }
}
