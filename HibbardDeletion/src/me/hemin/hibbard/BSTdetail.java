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
import java.util.Map;
import java.util.function.BiFunction;

public interface BSTdetail<Key extends Comparable<Key>, Value> extends BST<Key, Value>{

    Boolean contains(Key key);

    void putAll(Map<Key, Value> map);

    void delete(Key key);

    int size();

    void inOrderTraverse(BiFunction<Key, Value, Void> f);

    void deleteMin();
}
