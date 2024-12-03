package service;

import model.account;
import model.status;

import java.util.List;

public interface AccountService {
    List<account> getAllAccount();
    public void createNewAccount(account Account);
    account getAccountByUsername(String username);
    void deleteAccount(String username);
    void changeStatus(String username, status Status);
}