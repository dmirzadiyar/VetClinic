package model;

public class Client extends Entity {

    private String address;
    private int phoneNumber;

    public Client(int id, String name, String createdDate,
                  boolean active, String address, int phoneNumber) {
        super(id, name, createdDate, active);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    public void setAddress(String address) {
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address cannot be empty");
        }
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        if (phoneNumber <= 0) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String work() {
        return "Client brings animals to the clinic";
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", status=" + getStatus() +
                '}';
    }
}
