package family_budget;

import family_budget.dao.BudgetImpl;
import family_budget.model.Menu;
import family_budget.model.Product;
import family_budget.model.Purchase;

import java.io.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class BudgetAppl {
    private static final String SAVE_PATH = "lesson_68/code/family_budget/Family-budget.csv";

    public static void main(String[] args) throws IOException {
        AtomicInteger idCounter = new AtomicInteger(1);
        List<Purchase> purchaseList = new ArrayList<>(); // ?????
        List<Product> productList = new ArrayList<>(); // - ОК

        BudgetImpl budget = new BudgetImpl(purchaseList, 0);
        LocalDate now = LocalDate.now();
        BufferedReader br=new BufferedReader(new FileReader("lesson_68/code/Новая таблица - Лист1.csv"));
        String str=br.readLine();
        String[] family=str.split(",");
        str= br.readLine();
        // распечатать
        while (str!=null) {
            family = str.split(",");
            str = br.readLine();
            Product purchase = new Product(
                    family[0],
                    Double.parseDouble(family[1]),
                    Integer.parseInt(family[2])
            ); // Assuming you have a List<Product> in your Purchase class
            productList.add(purchase);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(" - Welcome to Family Budget Application - ");
        System.out.println(" - Enter month of purchase- ");
        String month = scanner.next();
        while(true){
            Menu.printMenu();
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1-> {
                    System.out.println("Input your budget amount: ");
                    double b = scanner.nextDouble();
                    budget = new BudgetImpl(purchaseList, b);
                    System.out.println("Your budget for month " + month + " is: " + b);
                }
                case 2-> {
                    System.out.println("Your purchases for " + month);
                    budget.print();
                }
                case 3-> {
                    productList.forEach(System.out::println);
                    //}
                    System.out.println("Enter data");
                    System.out.println(" Enter Name: ");
                    String person = scanner.next();
                    System.out.println("Please enter the name of the store: ");
                    String store = scanner.next();
                    System.out.println("Enter name of Product:");
                    String product = scanner.next();
                    double totalCost = getCost(productList,product);
                    List<Product> products = findProduct(productList, product);
                    budget.addPurchase(new Purchase(idCounter.getAndIncrement(),now,totalCost,store,person,products));
                    budget.print();
                }
                case 4-> {
                    budget.print();
                    System.out.println("Enter your purchase number to remove: ");
                    int num = scanner.nextInt();
                    budget.removePurchase(num);
                    budget.print();

                }case 5-> {
                    System.out.print(" \nEnter the store: ");
                    String store = scanner.next();
                    purchaseList= budget.sortedByStore(store);
                    purchaseList.forEach(System.out::println);
                    System.out.println(budget.budgetByStore(store));

                }
                case 6-> {
                    System.out.print("Enter your Name: ");
                    String person = scanner.next();
                    purchaseList= budget.sortedByPerson(person);
                    purchaseList.forEach(System.out::println);
                    System.out.println(budget.budgetByPerson(person));

                }
                case 7-> {
                    System.out.println("Purchases by Period:");
                    System.out.print(" \nInput Date From(yyyy-MM-dd):");
                    String dateString = scanner.next();
                    System.out.print(" \nInput Date To(yyyy-MM-dd):");
                    String dateString2 = scanner.next();
                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate  dateFrom= LocalDate.parse(dateString, dateFormat);
                    LocalDate dateTo = LocalDate.parse(dateString2, dateFormat);
                    purchaseList= budget.sortedByPeriod(dateFrom,dateTo);
                    purchaseList.forEach(System.out::println);


                }
                case 8->{
                    //вызвать метод и распечатать  System.out.println("Check budget: ");
                    double currentBudget = budget.checkMoney();
                    System.out.println("Current budget: " + currentBudget);


                }
                case 9 ->{
                    budget.print();
                    savePurchases(budget.collect());
                    System.out.println("Good bye!!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Wrong choice.");
                }

            }
        }

    }

    private static double getCost(List<Product> productList,String product) {
        double price= productList.stream().filter(product1 -> product1.getProduct().equalsIgnoreCase(product)).mapToDouble(Product::getPrice).sum();
        double quant= productList.stream().filter(product1 -> product1.getProduct().equalsIgnoreCase(product)).mapToDouble(Product::getQuantity).sum();
        return price*quant;
    }


    private static List<Product> findProduct(List<Product> productList, String product) {
        return productList.stream().filter(product1 -> product1.getProduct().equalsIgnoreCase(product)).collect(Collectors.toList());
    }

    private static void savePurchases(List<Purchase> purchases){
        try (PrintWriter writer = new PrintWriter(new FileWriter(SAVE_PATH, true))) {
            writer.println("Purchases: ");
            for (Purchase p :purchases){
                writer.printf("Number: %s, Date: %s, Price: %.2f, Store: %s, Person: %s, Products: %s%n",
                        p.getId(), p.getData(), p.getTotalCost(),
                        p.getStore(), p.getPerson(), p.getProducts());
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving purchases to file.");
        }
    }

    private static void printCells(String[] sells) {
        for (String s:sells){
            System.out.print(s+"\t");
        }
        System.out.println();
    }
}