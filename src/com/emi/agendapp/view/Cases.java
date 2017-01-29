package com.emi.agendapp.view;

import com.emi.agendapp.model.Contact;
import com.emi.agendapp.model.List;

public class Cases {
    public static void printHelp(){

        System.out.println("Esto es la ayuda");
        System.out.println("[h] - Help\n" + "[q] - Quit\n" +
                "[a] - Add\n" + "[d] - Delete\n" + "[u] - Unknown\n");


    }

    public static void printList(){
        System.out.println("Mirando Agenda..");

        List prueba = new List();
        prueba.print();







    }
}
