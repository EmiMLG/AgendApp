package com.emi.agendapp.controller;

import com.emi.agendapp.model.Command;
import com.emi.agendapp.manager.CommandParser;
import com.emi.agendapp.model.List;
import com.emi.agendapp.view.Cases;
import com.emi.agendapp.view.Prompt;
import com.emi.agendapp.view.Welcome;

import java.util.Scanner;

public class Funtions {


    public Funtions(){
        Welcome.printWelcome();
    }

    public void Cases(){
        boolean end = false;

        while (!end) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Opcion: ");
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
                    List.insert();
                    break;
                case DELETE:
                    System.out.println("Borra un contacto");
                    break;
                case UNKNOWN:
                    System.out.println("Pulsa [H] para obtener ayuda");
                    break;
            }







        }
    }







    }
