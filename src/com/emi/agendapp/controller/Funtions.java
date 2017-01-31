package com.emi.agendapp.controller;

import com.emi.agendapp.manager.ContactsManager;
import com.emi.agendapp.model.Command;
import com.emi.agendapp.manager.CommandParser;
import com.emi.agendapp.model.Contact;
import com.emi.agendapp.model.ListContacts;
import com.emi.agendapp.view.Cases;
import com.emi.agendapp.view.Welcome;

import java.util.Scanner;

public class Funtions {

    ListContacts listContacts = new ListContacts();


    public Funtions(){
        Welcome.printWelcome();
    }

    public void Cases(){
        boolean end = false;

        while (!end) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido a tu agenda, elige una opción: ");
            String opcion = scanner.nextLine();
            Command opcionCommand = CommandParser.parse(opcion);

            switch (opcionCommand){

                case HELP:
                    Cases.printHelp();
                    break;
                case LIST:
                    Cases.printList();
                    break;
                case QUIT:
                    System.out.println("Salir");
                    end = true;
                    System.exit(0);
                    break;
                case ADD:
                    ListContacts.insert();
                    break;
                case DELETE:
                    ContactsManager.delete(listContacts);
                    break;
                case UNKNOWN:
                    System.out.println("Pulsa [H] para obtener ayuda");
                    break;
            }







        }
    }







    }
