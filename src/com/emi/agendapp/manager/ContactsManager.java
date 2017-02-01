package com.emi.agendapp.manager;

import com.emi.agendapp.model.ListContacts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactsManager {

    public static void delete(ListContacts contacts) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce Position");

        try {
            int position = scanner.nextInt();

            if (position >= 0 && position < contacts.getListContact().size()) {

                contacts.getListContact().remove(position);
                System.out.println("Contacto borrado");
            }else {
                System.out.println("No hay contacto en esta posición");
            }
        }catch (InputMismatchException e){
            System.out.println("Posición no válida");
        }

    }


}
