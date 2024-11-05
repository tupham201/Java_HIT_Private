package btttuan3;

public class Student {
    public String studentCode;
    public String fullName;
    public byte age;
    public String gender;
    public String phoneNumber;
    public String email;

    public Student() {
    }

    public Student(String studentCode, String fullName, byte age, String gender, String phoneNumber, String email) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public byte getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void display() {
        System.out.println(String.format("%-15s %-20s %-5d %-10s %-15s %-25s", studentCode, fullName, age, gender, phoneNumber, email));
        System.out.println("-------------------------------------------------------------------------------");

    }
}