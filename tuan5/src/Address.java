public class Address {
    private String Stress;
    private String City;

    public Address() {
    }

    public Address(String city, String stress) {
        City = city;
        Stress = stress;
    }

    public String getStress() {
        return Stress;
    }

    public void setStress(String stress) {
        Stress = stress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
