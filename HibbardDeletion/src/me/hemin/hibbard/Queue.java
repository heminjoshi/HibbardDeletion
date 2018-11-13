/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hemin.hibbard;

/**
 *
 * @author Hemin
 */
public interface Queue<Item> {

    /**
     * Update this Queue by adding an item on the "newest" end.
     *
     * @param item the item to add
     */
    void enqueue(Item item);

    /**
     * Update this Queue by taking the oldest item off the queue.
     *
     * @return the item or null if there is no such item.
     */
    Item dequeue();

    /**
     * @return true if this stack is empty
     */
    boolean isEmpty();
}
