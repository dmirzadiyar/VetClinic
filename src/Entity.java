public class Entity {

    private int id;
    private String name;
    private String createdDate;
    private boolean active;

    public Entity(int id, String name, String createdDate, boolean active) {
        this.id = id;
        this.name = name;
        this.createdDate = createdDate;
        this.active = active;
    }

    public Entity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void deactivate() {
        this.active = false;
    }

    public String getStatus() {
        return active ? "Active" : "Inactive";
    }

    @Override
    public String toString() {
        return "Entity{id=" + id +
                ", name='" + name + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", active=" + active +
                '}';
    }
}
