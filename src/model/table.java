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
public class table {
    
    private int tablenumber;
    private int capacity;
    private boolean available;
    private customer bookedby;
    
    
    /**
     * 
     * @param tablenumber which number is the table that was booked

     */
   public table (int tablenumber, int capacity ){
       
       this.tablenumber = tablenumber;
       this.capacity = capacity;
       this.available = true;
       this.bookedby = null;
      
       
       
   }
       public boolean book (customer customer) {

       if( available) {
           
           available = false;
           this.bookedby = customer;
             return true;
       }
       else {
           return false;
       }
       }
           public boolean isavailable() {
               
               return available;
           }
           
           public customer getbookedby(){
               
               return bookedby;
           }
           
           
           @Override
           public String toString() {
               
               if (available){
                   
                   return "this is the table number " + tablenumber + " and it is free";
               }
               return "this table number " + tablenumber + " booked by " + bookedby.getname();
           }
}

