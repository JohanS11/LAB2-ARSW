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
public class CountThread implements Runnable{
	int inicio;
	int fin;
	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	
	
	
	 CountThread (int inicio, int fin){
		this.inicio = inicio;
		this.fin = fin;
	}
	
	@Override
	public void run() {
		for (int i = this.getInicio(); i < this.getFin(); i++) {
			System.out.println(i);
			
		}
        System.out.println("Hello from a thread!");
    }
	
	
    
}
