package com.trimindtech.training.home03;

public class HouseholdRunner {
    public static void main(String[] args) {
        Household head = new Household(5,5000.0);
        head.working();
        head.cooking();
        head.sleeping();
        System.out.println(head);
    }
}
