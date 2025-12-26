public class VetClinic {

    private String clinicName;
    private String address;
    private String phoneNumber;
    private int animalsCount;

    public VetClinic(String clinicName, String address, String phoneNumber, int animalsCount) {
        this.clinicName = clinicName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.animalsCount = animalsCount;
    }

    public VetClinic() {
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAnimalsCount() {
        return animalsCount;
    }

    public void setAnimalsCount(int animalsCount) {
        this.animalsCount = animalsCount;
    }

    public void admitAnimal() {
        animalsCount++;
    }

    public boolean canAcceptMoreAnimals() {
        return animalsCount < 50;
    }

    @Override
    public String toString() {
        return "VetClinic{" +
                "clinicName='" + clinicName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", animalsCount=" + animalsCount +
                '}';
    }
}


