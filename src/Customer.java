/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rosti
 */
public class Customer {
    private int ID;
    private Boolean isNew;
    private double total;
    
    public Customer() {
        this.ID = 1;
        this.isNew = true;
        this.total = 1000;
    }
    
    public Customer(int ID, Boolean isNew, double total) {
        this.ID = ID;
        this.isNew = isNew;
        this.total = total;
    }
    
    public void displayCustomerInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Client status: " + isNew);
        System.out.println("Total purchases: " + total);
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}