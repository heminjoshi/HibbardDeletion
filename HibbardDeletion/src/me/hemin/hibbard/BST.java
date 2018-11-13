/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hemin.hibbard;
import java.util.Set;
/**
 *
 * @author Hemin
 */
public interface BST<Key extends Comparable<Key>, Value> {

    Value get(Key key);

    Value put(Key key, Value value);

    Set<Key> keySet();
    
    void delete(Key key);
}