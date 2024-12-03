package model;

public class person {
    private String id;
    private String fullname;
    private int age;
    private address Address;
    private String birthday;

    public person() {
    }

    public person(String id, String fullname, int age, String birthday, address address) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.birthday = birthday;
        Address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public address getAddress() {
        return Address;
    }

    public void setAddress(address address) {
        Address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "person{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", Address=" + Address +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
