package com.emi.agendapp.controller;

import com.emi.agendapp.model.Command;
import com.emi.agendapp.manager.CommandParser;
import com.emi.agendapp.view.Cases;
import com.emi.agendapp.view.Prompt;
import com.emi.agendapp.view.Welcome;

public class Funtions {


    public Funtions(){
        Welcome.printWelcome();
    }

    public void Cases(){
        boolean end = false;

        while (!end) {

            String command = Prompt.read();
            Command com = CommandParser.parse(command);

            switch (com){

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
                    System.out.println("Añade un contacto");
                    break;
                case DELETE:
                    System.out.println("Borra un contacto");
                    break;
                case UNKNOWN:
                    System.out.println("Desconocido");
                    break;
            }







        }
    }







    }
