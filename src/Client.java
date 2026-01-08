public class Client extends Entity {

    private String address;
    private int phoneNumber;

    public Client(int id, String name, String createdDate, boolean active,
                  String address, int phoneNumber) {

        super(id, name, createdDate, active);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Override #1
    @Override
    public String work() {
        return "Client brings animals to the clinic";
    }

    // Override #2
    @Override
    public String toString() {
        return "Client{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", phone=" + phoneNumber +
                ", address='" + address + '\'' +
                ", status=" + getStatus() +
                '}';
    }
}
