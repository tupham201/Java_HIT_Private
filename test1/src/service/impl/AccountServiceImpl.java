package service.impl;

import model.account;
import model.status;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private List<account> accounts = new ArrayList<>();
    @Override
    public List<account> getAllAccount() {
        return accounts;
    }

    @Override
    public void createNewAccount(account Account) {
        for(account acc : accounts){
            if(acc.getUsername().equals(acc.getUsername())){
                System.out.println("Tạo tài khoản thành công");
                return;
            }
        }
        accounts.add(Account);
    }

    @Override
    public account getAccountByUsername(String username) {
        for(account acc : accounts){
            if(acc.getUsername().equals(username)){
                return acc;
            }
        }
        System.out.println("Tìm kiếm không thành công");
        return null;
    }

    @Override
    public void deleteAccount(String username) {
        for(int i = accounts.size()-1 ;i>=0;i--){
            if(accounts.get(i).getUsername().equals(username))
                accounts.remove(i);
            System.out.println("xóa tài khoản thành công");
            return;
        }
        System.out.println("Không tìm thấy tài khoản");
    }
    @Override
    public void changeStatus(String username, status Status) {
        for(account acc : accounts){
            if(acc.getUsername().equals(username)){
                acc.setStatus(Status);
                System.out.println("Thay đổi Status thành công");
                return;
            }
        }
        System.out.println("Thay đổi khoong thành công");
    }
}
