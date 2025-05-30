package org.example;

import org.testng.annotations.*;

public class Beforeclass {
    @BeforeClass
    void login(){
        System.out.println("This is login");
    }
    @Test
    public void search() {
        System.out.println("This is search");
    }
    @AfterClass
    void logout(){
        System.out.println("This is logout");
    }
    @Test
    public void advancedsearch(){
        System.out.println("This is advanced search");
    }
}
//BeforeClass and AfterClass are executed once before and after all the test methods