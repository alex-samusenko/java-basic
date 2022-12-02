package ru.java.lesson6;

public class Money {
    private final int base;
    private final int fractional;

    public Money(int base, int fractional) {
        this.base = base;
        this.fractional = fractional;
    }

    public String getAmount() {
        //return String.valueOf(base) + "," + String.valueOf(fractional);
        return String.format("%1$,.2f", Double.parseDouble(base + "." + fractional));
    }

    public static void main(String[] args) {
        System.out.println("1000 рублей, 90 копеек: " + new Money(1000, 90).getAmount());
        System.out.println("0 рублей, 1 копейка: " + new Money(0, 1).getAmount());
    }
}
