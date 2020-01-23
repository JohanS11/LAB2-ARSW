/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
    	
    	CountThread h1 = new CountThread(0,99);
    	CountThread h2 = new CountThread(99,199);
    	CountThread h3 = new CountThread(200,299);
    	Thread t1 = new Thread(h1);
    	Thread t2 = new Thread(h2);
    	Thread t3 = new Thread(h3);
    	t1.start();
    	t2.start();
    	t3.start();
        
    }
    
}
