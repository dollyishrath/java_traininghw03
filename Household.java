package com.trimindtech.training.home03;

public class Household {


    public Household(int occupants1, double income1) {
        this.occupants = occupants1;
        this.income = income1;
    }
    public Household(){
        this.occupants = 0;
        this.income = 1;
    }
    public Household(int x){
      this.occupants = x;
    }
    public Household(int x,int y){
        this.occupants = x;
        this.income = y;
    }

    private int occupants;
    private double income;

    public int getOccupants() {
        return occupants;
    }

    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    public void working(){
        System.out.println("working");
    }
    public void cooking(){
        System.out.println("cooking");
    }
    public void sleeping(){
        System.out.println("sleeping");
    }
}
