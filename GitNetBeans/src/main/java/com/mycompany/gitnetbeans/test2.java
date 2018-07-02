/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gitnetbeans;

/**
 *
 * @author jc.ruiz
 */
public class test2 {
    
    private String name;
    
    private int cant;
    
   
    public test2(String name, int cant, double cost) {
        this.name = name;
        this.cant = cant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
}
