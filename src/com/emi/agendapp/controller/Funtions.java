package com.emi.agendapp.controller;

import com.emi.agendapp.manager.ContactsManager;
import com.emi.agendapp.model.Command;
import com.emi.agendapp.manager.CommandParser;
import com.emi.agendapp.model.Contact;
import com.emi.agendapp.model.ListContacts;
import com.emi.agendapp.util.ReadContacts;
import com.emi.agendapp.view.Cases;
import com.emi.agendapp.view.Prompt;
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
                    System.out.println("Has elegido, VER LISTA DE CONTACTOS");
                    Cases.printList();
                    break;
                case QUIT:
                    System.out.println("Saliendo, gracias por utilizar AgendApp");
                    end = true;
                    System.exit(0);
                    break;
                case ADD:
                    System.out.println("Has elegido, AÑADIR UN CONTACTO");
                    ListContacts.insert();
                    break;
                case DELETE:
                    System.out.println("Has elegido, BORRAR UN CONTACTO");
                    ContactsManager.delete(listContacts);
                    break;

                case UNKNOWN:
                    System.out.println("Comando desconocido, pulsa [H] para obtener ayuda");
                    break;
            }
        }
    }

    }
