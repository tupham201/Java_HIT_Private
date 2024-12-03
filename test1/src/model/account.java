package model;

import java.sql.Struct;

public class account extends person{
    private String username;
    private String password;
    private role Role;
    private status Status;

    public account() {
    }
    public account(String id, String fullname, int age, String birthday, address address) {
        super(id, fullname, age, birthday, address);
    }

    public account(String username, String password, role role, status status) {
        this.username = username;
        this.password = password;
        Role = role;
        Status = status;
    }

    public account(String id, String fullname, int age, String birthday, address address, String username, String password, role role, status status) {
        super(id, fullname, age, birthday, address);
        this.username = username;
        this.password = password;
        Role = role;
        Status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public role getRole() {
        return Role;
    }

    public void setRole(role role) {
        Role = role;
    }

    public status getStatus() {
        return Status;
    }

    public void setStatus(status status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "account{" +
                "Status=" + Status +
                ", username='" + username + '\'' +
                ", Role=" + Role +
                '}';
    }
}
