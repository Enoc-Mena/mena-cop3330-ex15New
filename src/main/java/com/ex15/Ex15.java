/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex15;
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        String password = "ucfstudent@123";
        String username;
        String userPassword;

        Scanner use = new Scanner(System.in);
        System.out.print("Enter your username: ");
        username = use.nextLine();

        Scanner pass = new Scanner(System.in);
        System.out.print("Enter your password: ");
        userPassword = pass.nextLine();

        if(password.equals(userPassword)) {

            System.out.print("Welcome!");

        } else {

            System.out.print("I don't know you.");

        }

    }

}
