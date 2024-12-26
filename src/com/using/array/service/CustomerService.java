package com.using.array.service;
import com.using.array.model.Customer;
import java.util.Scanner;
public class CustomerService {

    int customerIndex = 0;
    private Customer[] customers = new Customer[2];
    private Scanner sc = new Scanner(System.in);

    void printCustomer(Customer customer){
        System.out.println(customer);
    }

    public Customer createCustomer () {
        Customer customer = new Customer();
        System.out.println("Please enter id:");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter name:");
        String name = sc.nextLine();

        System.out.println("Please enter city:");
        String city = sc.nextLine();

        System.out.println("Please enter mobile number:");
        int mobileNo = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter age:");
        int age = Integer.parseInt(sc.nextLine());

       // Customer c = new Customer();
        customer.setId(id);
        customer.setAge(age);
        customer.setCity(city);
        customer.setName(name);
        customer.setMobileNo(mobileNo);
        customers[customerIndex] = customer;
        customerIndex++;
        return customer;
    }
    public void displayCustomers(){
        for(Customer customer : customers){
            System.out.println("Customer Info: " + customer);
        }
    }
    }
