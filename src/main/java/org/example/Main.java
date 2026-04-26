package org.example;

import org.example.models.DeluxeBurger;
import org.example.models.Hamburger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Hamburger hamburger = new Hamburger("Basic", "Normal", 3.56, "Wrap");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.itemizeHamburger();

        System.out.println("---");

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Should not work", 50.0);
        db.itemizeHamburger();
    }
}