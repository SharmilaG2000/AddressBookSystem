package com.bridgelabz.adressbooksystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class to represent a Contact
class Contact {
    String firstName, lastName, address, city, state, email;
    int zip;
    long phone;

    public Contact(String firstName, String lastName, String address, String city,
                   String state, int zip, long phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nName: " + firstName + " " + lastName +
                "\nAddress: " + address + ", " + city + ", " + state + " - " + zip +
                "\nPhone: " + phone + "\nEmail: " + email;
    }
}

public class UC1AddressBookContact {

    // List to store contacts
    static List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);

        // Prompting user for contact details
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter City: ");
        String city = sc.nextLine();
        System.out.print("Enter State: ");
        String state = sc.nextLine();
        System.out.print("Enter ZIP: ");
        int zip = sc.nextInt();
        System.out.print("Enter Phone Number: ");
        long phone = sc.nextLong();
        sc.nextLine(); // consume newline
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        // Creating and adding the contact
        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phone, email);
        contacts.add(newContact);

        // Displaying the added contact
        System.out.println("\nContact Added Successfully!");
        System.out.println(newContact);
    }
}
