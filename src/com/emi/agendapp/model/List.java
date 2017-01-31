package com.emi.agendapp.model;

import com.emi.agendapp.view.Prompt;

import java.util.LinkedList;

public class List {

    private static LinkedList<Contact> list = new LinkedList<>();



    public static void print(){
        for(Contact contact: list){
            System.out.println(List.list.indexOf(contact) + contact.getName()+contact.getPhone());

        }
    }
    public static void insert(){
        System.out.print("Nombre: ");
        String nameContact = Prompt.read();
        System.out.print("Teléfono: ");
        String phoneContact = Prompt.read();

        Contact contact = new Contact(nameContact, phoneContact);
        list.add(contact);

        System.out.println("Contacto guardado");

    }

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public static LinkedList<Contact> getList() {
        return list;
    }

    public static void setList(LinkedList<Contact> list) {
        List.list = list;
    }
}
