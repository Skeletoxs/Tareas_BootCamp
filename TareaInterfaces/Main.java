package com.CompanyA.TareaInterfaces;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.delete();
        cocheCRUD.findAll();
        cocheCRUD.save();
    }
}
