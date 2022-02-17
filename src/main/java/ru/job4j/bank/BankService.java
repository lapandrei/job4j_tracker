package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковской службы, которая добавляет
 * пользователей и их банковские счета, и может переводить деньги
 * со счета на счет
 * @author ANDREY LAPIKHIN
 * @version 1.0
 */
public class BankService {
    /**
     * Пользователи сервиса сохраняются в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в коллекцию, при этом у пользователя создается
     * список счетов типа ArrayList
     * Метод проверяет наличие пользователя в коллекции
     * @param user пользователь, который добавляется в коллекцию
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет банковский счет пользователя в коллекцию типа ArrayList
     * Методу передается паспорт пользователя и аккаунт, который нужно добавить
     * Внутри метода проверяется существование пользователя и отсутствие у него данного аккаунта
     * @param passport данные пользователя, которому нужно добавить счет
     * @param account счет, который добавляется пользователю
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    /**
     * Метод проверяет наличие пользователя в коллекции по паспорту
     * если пользователь найден, то возвращается ссылка на него
     * если не найден, то возвращается null
     * @param passport данные пользователя, которого нужно найти
     * @return ссылка на пользователя, который найден в коллекции
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет по переданным ему данным пользователя и реквизитам счета
     * Метод возвращает ссылку на найденный счет или null, если такого пользователя или счета нет
     * @param passport данные пользователя у которого нужно найти счет
     * @param requisite реквизиты счета, который нужно найти
     * @return ссылка на счет который найден у пользователя
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account account : list) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод осуществляет перевод денег с одного счета на другой
     * Метод проверяет наличие пользователей и счетов, переданных ему,
     * а также наличие необходимых для перевода средств
     * Метод возвращает true, если деньги переведены
     * и false если не найден какой-то из пользователей или счетов перевода,
     * либо не хватаетс средств на счете для осуществления перевода
     * @param srcPassport данные пользователя, со счета которого переводятся средства
     * @param srcRequisite данные счета донора
     * @param destPassport данные пользователя, которому переводятся средства
     * @param destRequisite данные счета репициента
     * @param amount количество денег, которые нужно перевести
     * @return возвращает true при успешном выполнении, иначе false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(srcPassport, destRequisite);
        if (src == null || dest == null || src.getBalance() - amount < 0) {
            return false;
        }
        dest.setBalance(dest.getBalance() + amount);
        src.setBalance(src.getBalance() - amount);
        return true;
    }
}