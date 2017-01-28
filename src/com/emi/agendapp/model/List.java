package com.emi.agendapp.model;

import java.util.LinkedList;

public class List {

    private LinkedList<Contact> list = new LinkedList<>();

    public void print(){
        for(Contact contact: list){
            System.out.println(contact.getName() + contact.getPhone() );
        }
    }
    public void add(Contact contact){
        this.list.add(contact);
    }

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public LinkedList<Contact> getList(){
        return list;
    }







}
