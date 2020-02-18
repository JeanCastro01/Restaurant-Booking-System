/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jeancastro
 */
public class customer {
    
    private String name;
    private String email;
    
    public customer(String name, String email) {
        
        
        this.email = email;
        this.name = name;
    }
    
    protected String getname(){
        return name;
    }
    public String getemail() {
        return email;
    }
    
}
