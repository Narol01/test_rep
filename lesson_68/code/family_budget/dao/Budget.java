package family_budget.dao;

import family_budget.model.Product;
import family_budget.model.Purchase;

import java.time.LocalDate;
import java.util.List;

public interface Budget {
    boolean addPurchase(Purchase purchase);

    Purchase removePurchase(int id);

    List<Purchase> sortedByPerson(String person);
    double calcBudget();
    double budgetByPerson(String person);
    double budgetByStore(String store);
    List<Purchase> sortedByStore(String store);
    double budgetByPeriod (LocalDate from, LocalDate to);
    List<Purchase> sortedByPeriod(LocalDate from, LocalDate to);
    boolean checkBudget();
    double checkMoney();
    void print();
}