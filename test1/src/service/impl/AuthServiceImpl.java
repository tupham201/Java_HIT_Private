package service.impl;

import model.account;
import model.role;
import model.status;
import service.authservice;

import java.util.ArrayList;
import java.util.Scanner;

public class AuthServiceImpl implements authservice {
    private final ArrayList<account> accounts = new ArrayList<>();
    private account currentAccout;
    public AuthServiceImpl(){
        accounts.add(new account("admin","123456", role.ADMIN, status.ACTIVE));
        accounts.add(new account("user","123456", role.USER, status.ACTIVE));
        currentAccout = null;
    }
    public account GetCurr(){
        return currentAccout;
    }
    @Override
    public void login(Scanner sc) {
        System.out.println("Nhập tài khoản: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String pass = sc.nextLine();
        for(account accountss : accounts){
            if(accountss.getUsername().equals(username) && accountss.getPassword().equals(pass)){
                currentAccout = accountss;
                System.out.println("Đăng nhập thành công");
                return;
            }

        }
        System.out.println("Đăng nhập không thành công");
    }

    @Override
    public void logout() {
        if(currentAccout != null){
            System.out.println("đăng xuất thành công");
            currentAccout = null;
        }
        else{
            System.out.println("Không có tài khoản nào được đăng nhập");
        }
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        for(account accountss : accounts){
            if(accountss.getUsername().equals(username) && accountss.getPassword().equals(oldPassword)){
                accountss.setPassword(newPassword);
                System.out.println("Thay đổi mật khẩu thành công");
                return;
            }
        }
        System.out.println("Thay đổi mật khẩu không thành công");
    }
}
