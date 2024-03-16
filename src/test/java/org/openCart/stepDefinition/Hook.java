package org.openCart.stepDefinition;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hook {

    @BeforeAll
    public static void before_All(){
        System.out.println("@BeforeAll-Creating DB Connection");
    }

    @AfterAll
    public static void after_All(){
        System.out.println("@AfterAll-Disconnecting DB Connection");
    }

    @BeforeStep
    public static void beforeEachStep(){
        System.out.println("******New Step started********");
    }

    @AfterStep
    public static void afterEachStep(){
        System.out.println("*********Step Completed*********");
    }
}
