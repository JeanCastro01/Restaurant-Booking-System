/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingrestaurant;

import model.customer;
import model.table;

/**
 *
 * @author jeancastro
 */
public class Bookingrestaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        table t1 = new table (10,4);
        table t2 = new table (15,4);    
        table t3 = new table (20,4);
        table t4 = new table (65,4);
        
     
        
        customer c1 = new customer ("Amilcar", "amilcar@cct.ie");
        customer c2 = new customer ("ken","ken@ctt.ie");
        
        
        t1.book(c1);
        t2.book(c2);
        
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
    
}
