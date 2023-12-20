package family_budget.dao;

import family_budget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BudgetImpl implements Budget{
    // поля
    List<Purchase> purchaseList;
    double budget;

    public BudgetImpl(List<Purchase> purchaseList, double budget) {
        this.purchaseList = new ArrayList<>();
        this.budget = budget;
    }
    public BudgetImpl(List<Purchase> purchaseList) {
        this.purchaseList = new ArrayList<>();
    }

    @Override
    public boolean addPurchase(Purchase purchase) {
        // если бюджет позволяет?
        // проверка на уникальность? - может быть такой чек был введен?
        return purchaseList.add(purchase);
    }
    @Override
    public Purchase removePurchase(int id) {
        Purchase removedPurchase = purchaseList.stream()
                .filter(p->p.getId()==id)
                .findFirst()
                .orElse(null);
        if (removedPurchase != null){
            purchaseList.remove(removedPurchase);
        }
        return removedPurchase;
    }

    @Override
    public List<Purchase> sortedByPerson(String person) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getPerson().equals(person)).toList();
    }

    @Override
    public double calcBudget() {
        return purchaseList.stream()
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public double budgetByPerson(String person) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getPerson().equals(person))
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public double budgetByStore(String store) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getStore().equals(store))
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public List<Purchase> sortedByStore(String store) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getStore().equals(store)).toList();
    }

    @Override
    public double budgetByPeriod(LocalDate from, LocalDate to) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getDate().isAfter(from)&&purchase.getDate().isBefore(to))
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public List<Purchase> sortedByPeriod(LocalDate from, LocalDate to) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getDate().isAfter(from)&&purchase.getDate().isBefore(to)).toList();
    }
    @Override
    public boolean checkBudget() {
        return budget >= calcBudget();
    }

    @Override
    public double checkMoney() {
        return budget - calcBudget();
    }

    @Override
    public void print() {
        purchaseList.forEach(System.out::println);
    }
    public List<Purchase>collect (){
        return purchaseList;
    }
}