package com.emi.agendapp.view;

import com.emi.agendapp.model.ListContacts;

public class Cases {
    public static void printHelp(){

        System.out.println("Esto es la ayuda");
        System.out.println("[h] - Help\n" + "[q] - Quit\n" +
                "[a] - Add\n" + "[d] - Delete\n" + "[u] - Unknown\n");


    }

    public static void printList(){
        System.out.println("Mirando Agenda..");

        ListContacts prueba = new ListContacts();
        prueba.print();

    }

}
