/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hemin.hibbard;

import java.util.Random;

/**
 *
 * @author Hemin
 */
public class HibbardDeletion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BSTSimple bstSimple = new BSTSimple();
        
        
        Random random = new Random();
        int n = 3000; //size of the tree = 1000, 2500, 3000
        for(int i = 0 ; i < n ; i++)
        {
            while(true)
            {
                int ran  =  random.nextInt((5000-1)+1)+1;
                if(!bstSimple.contains(ran))
                {
                    bstSimple.put(ran, ran);
                    break;
                }
            }
        }
        System.out.println("Size of the tree before hibbard deletions: " + bstSimple.size());
        
        int noOfInsertions = 7500000; // noOfInsertions = 3000000, 5000000, 7500000
        for(int i = 0 ; i < noOfInsertions ; i++)
        {
            while(true)
            {
                int ran  =  random.nextInt((5000-1)+1)+1;
                if(bstSimple.contains(ran))
                {
                    bstSimple.delete(ran);
                    break;
                }
            }
            while(true)
            {
                int ran  =  random.nextInt((5000-1)+1)+1;
                if(!bstSimple.contains(ran))
                {
                    bstSimple.put(ran, ran);
                    break;
                }
            }
            
        }
        System.out.println("\n Height of the tree after hibbard deletions: : "+bstSimple.height());
    }
    
}
