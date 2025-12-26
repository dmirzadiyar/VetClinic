public class Client extends Entity {
    private String address;
    private int phoneNumber;

    public Client(String name, int id, String address, int phoneNumber) {
        super.setName(name);
        super.setId(id);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getAddress() {
        return address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getClientName() {
        return super.getName();
    }
    public int getClientId() {
        return super.getId();
    }
}

