package ua.javarush.task.jdk13.task41.task4119.strategy;

import ua.javarush.task.jdk13.task41.task4119.customer.Customer;

import java.time.LocalDate;

public class CreditCardStrategy implements PaymentStrategy {

    private String cardNumber;
    private String name;
    private int cvv;
    private LocalDate expiryDate;

    public CreditCardStrategy(Customer customer) {
        this.cardNumber = customer.getCardNumber();
        this.name = customer.getName();
        this.cvv = customer.getCardCvv();
        this.expiryDate = customer.getCardExpiryDate();
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Оплачено товарів на $%d кредитною карткою %s.\n", amount, cardNumber);
    }
}
