package org.example;

import org.testng.annotations.*;

public class Beforeclass {
    @BeforeClass
    void login(){
        System.out.println("This is login");
    }
    @Test(priority =1)
    public void search() {
        System.out.println("This is search");
    }
    @AfterClass
    void logout(){
        System.out.println("This is logout");
    }
    @Test(priority=2)
    public void advancedsearch(){
        System.out.println("This is advanced search");
    }
}
