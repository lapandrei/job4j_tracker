package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
            List<Account> list = users.get(findByPassport(passport));
            if (list != null && !list.contains(account)) {
                list.add(account);
            }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        List<Account> list = users.get(findByPassport(passport));
        if (list != null) {
            for (Account account : list) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        User sender = findByPassport(srcPassport);
        User recipient = findByPassport(destPassport);
        if (sender == null || recipient == null) {
            return false;
        }
        Account src = findByRequisite(sender.getPassport(), srcRequisite);
        Account dest = findByRequisite(recipient.getPassport(), destRequisite);
        if (src == null || dest == null) {
            return false;
        }
        if (src.getBalance() - amount >= 0) {
            dest.setBalance(dest.getBalance() + amount);
            src.setBalance(src.getBalance() - amount);
        }
        return true;
    }
}