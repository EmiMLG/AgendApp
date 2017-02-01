package com.emi.agendapp.view;

import com.emi.agendapp.model.ListContacts;

public class Cases {
    public static void printHelp(){

        System.out.println("Esto es la ayuda");
        System.out.println("[h] - Help\n" + "☠[q] - Quit☠\n" +
                "✐[a] - Add✐\n" + "☰[l] - list☰\n"
                + "✘[d] - Delete✘\n");


    }

    public static void printList(){
        System.out.println("Mirando Agenda..");

        ListContacts prueba = new ListContacts();
        prueba.print();

    }

}
