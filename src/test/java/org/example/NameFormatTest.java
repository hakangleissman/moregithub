package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatTest {

    private NameFormat nameFormat;

    @BeforeEach
    void setUp(){
        nameFormat = new NameFormat();
    }

//    @Test
//    public void TestIfFirstStringIsUpperCase() {
//
//        Assertions.assertEquals("H", nameFormat.toNameFormat("h"));
//    }


    @Test
    public void testFalseInput() {

        Assertions.assertTrue(nameFormat.toNameFormatBoolean("h"));
    }

    @Test
    public void testCertainDeath() {
        Assertions.assertEquals(3,5);
    }

}