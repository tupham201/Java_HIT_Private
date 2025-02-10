package org.example.Service;

import org.example.ENTYTI.Account;
import org.example.ENTYTI.Computer;
import org.example.ENTYTI.Status;
import org.example.Service.IService.IAccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements IAccountService {
    private List<Account> accounts = new ArrayList<>();
    @Override
    public List<Account> getAllAccount() {
        return accounts;
    }

    @Override
    public boolean createNewAccount(Account account) {
        for(Account acc : accounts){
            if(acc.getIdUser().equals(account.getIdUser())){
                return true;
            }
            accounts.add(account);
        }
    }

    @Override
    public Account getAccountByUsername(String username) {
        return null;
    }

    @Override
    public void deleteAccount(String username) {

    }

    @Override
    public void changeStatus(String username, Status status) {

    }
}
