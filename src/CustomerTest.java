/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rosti
 */
public class CustomerTest {
    public static void main(String args[]) {
        Customer customer1 = new Customer();
        customer1.setID(228);
        System.out.println("ID: " + customer1.getID());
        customer1.setTotal(66.6);
        System.out.println("Status: " + customer1.getIsNew());
        customer1.setIsNew(Boolean.FALSE);
        System.out.println("Total: " + customer1.getTotal());
        
        Customer customer2 = new Customer(999, Boolean.TRUE, 500);
        System.out.println("ID: " + customer2.getID());
        System.out.println("Status: " + customer2.getIsNew());
        System.out.println("Total: " + customer2.getTotal());
    }
}