package com.example.jairo.pruebatest.test;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void prueba_1(){
        assertTrue(5 > 1);
    }

    public void prueba_2(){
        assertTrue(5 < 1);
    }
}