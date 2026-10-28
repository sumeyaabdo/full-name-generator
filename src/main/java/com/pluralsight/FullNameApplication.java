package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);

        System.out.println("Please Enter your name");
        System.out.print("First Name:");
        String firstName = newScanner.nextLine();

        System.out.print("Middle Name:");
        String middleName = newScanner.nextLine();

        System.out.print("Last Name:");
        String LastName = newScanner.nextLine();

        System.out.print("Suffix:");
        String suffix = newScanner.nextLine();

        //   System.out.println("Full Name: " + firstName + " " + middleName + " " + LastName + " " + suffix);

//print the results of our madness
        String fullName = firstName;
        if(middleName.length() < 0){
            fullName += " " + middleName;
        }

        fullName += " " + LastName;

        if(!suffix.equals("")){
            fullName += " " + suffix;
        }
        System.out.println(fullName);

    }
}
