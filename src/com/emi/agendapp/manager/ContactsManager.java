package com.emi.agendapp.manager;

import com.emi.agendapp.model.Contact;
import com.emi.agendapp.model.ListContacts;

import java.util.LinkedList;
import java.util.Scanner;

public class ContactsManager {

    /*public static void add(Contact contact, ListContacts listContacts){

        if (listContacts.getList()==null){
            System.out.println("Lista vacía");
            return;
        }
    }*/

    public static void delete(ListContacts contacts){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce Position");

        String position = scanner.nextLine();

        contacts.getListContact().remove(Integer.parseInt(position));



    }

}
