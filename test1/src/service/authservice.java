package service;

import model.account;

import java.util.ArrayList;
import java.util.Scanner;

public interface authservice {
    public void login(Scanner sc);
    public void logout();
    public void changePassword(String username, String oldPassword, String newPassword);
}