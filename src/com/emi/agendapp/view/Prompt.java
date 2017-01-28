package com.emi.agendapp.view;

import java.util.Scanner;

public class Prompt {

    public static void print(){
        System.out.println("-->");
    }

    public static String read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre");
        String name = scanner.nextLine();

        System.out.println("Teléfono");
        String phone = scanner.nextLine();

        return scanner.nextLine();
    }
}
