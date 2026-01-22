package model;

public abstract class Entity {
    private int id;
    private String name;
    private String createdDate;
    private boolean active;

    public Entity(int id, String name, String createdDate, boolean active) {
        setId(id);
        setName(name);
        this.createdDate = createdDate;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getStatus() {
        return active ? "Active" : "Inactive";
    }

    public abstract String work();
}
