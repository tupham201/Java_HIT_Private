package org.example.Service.IService;

import org.example.ENTYTI.Account;
import org.example.ENTYTI.Status;

import java.util.List;

public interface IAccountService {
    List<Account> getAllAccount();
    public boolean createNewAccount(Account account);
    Account getAccountByUsername(String username);
    void deleteAccount(String username);
    void changeStatus(String username, Status status);
}
