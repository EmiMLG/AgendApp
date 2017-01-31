package com.emi.agendapp.manager;

import com.emi.agendapp.model.ListContacts;
import com.emi.agendapp.view.Prompt;

import java.util.Scanner;

public class ContactsManager {

    public static void delete(ListContacts contacts){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce Position");

        String position = scanner.nextLine();

        contacts.getListContact().remove(Integer.parseInt(position));

        }

}
