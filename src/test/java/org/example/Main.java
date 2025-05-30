package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Main {
    @BeforeMethod
     void login(){
         System.out.println("This is login");
     }
     @Test
     public void search(){
         System.out.println("This is search");
     }
     @Test
     public void advancedsearch(){
         System.out.println("This is advanced search");
     }
     @AfterMethod
     void logout(){
         System.out.println("This is logout");
     }
}
//BeforeMethod and AfterMethod runs a number of times before the main test