package com.emi.agendapp.model;

import com.emi.agendapp.view.Prompt;

import java.util.LinkedList;

public class ListContacts {

    private static LinkedList<Contact> list = new LinkedList<>();

    public static void print(){
        for(Contact contact: list){
            System.out.println("(" + ListContacts.list.indexOf(contact)+ ")" + " - " + contact.getName()+ " - " + contact.getPhone());

        }
    }
    public static void insert(){
        System.out.print("Nombre: ");
        String nameContact = Prompt.read();
        System.out.print("Teléfono: ");
        String phoneContact = Prompt.read();

        Contact contact = new Contact(nameContact, phoneContact);
        list.add(contact);

        System.out.println("Contacto añadido en tu agenda\n\n\n");

    }

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public LinkedList<Contact>getListContact() {
        return list;
    }
}
