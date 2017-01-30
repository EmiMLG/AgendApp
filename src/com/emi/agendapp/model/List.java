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
    public static void add(){
        System.out.println("Nombre: ");
        String nameContact = Prompt.read();
        System.out.println("Teléfono: ");
        String phoneContact = Prompt.read();

        Contact contact = new Contact(nameContact, phoneContact);
        list.add(contact);

        System.out.println("Contacto guardado");

    }

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public LinkedList<Contact> getList(){
        return list;
    }







}
