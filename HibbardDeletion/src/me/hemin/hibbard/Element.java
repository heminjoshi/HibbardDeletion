/*
 * Copyright (c) 2017. Phasmid Software
 */

package me.hemin.hibbard;

public class Element<Item> {
    Element(Item x, Element<Item> n) {
        item = x;
        next = n;
    }

    Element(Item x) {
        this(x, null);
    }

    final Item item;
    Element<Item> next;
}
