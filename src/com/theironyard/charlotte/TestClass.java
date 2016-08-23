package com.theironyard.charlotte;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by meekinsworks on 8/22/16.
 */
public class TestClass  {
    @Test
    public void oneSumDouble(){
        assertEquals(5, Problems.oneSumDouble(2, 3));

    }
    @Test
    public void twoSleepIn() {
        assertTrue(true, !Problems.twosleepIn(true, true));
        assertTrue(true, !Problems.twosleepIn(false, false));

    }
    @Test
    public void threeMonkeyTrouble() {
        assertTrue(true, Problems.threeMonkeyTrouble(true, true));
        assertTrue(true, !Problems.threeMonkeyTrouble(true, true));
        assertTrue(false, Problems.threeMonkeyTrouble(false, true));
    }

    @Test
    public void fourDiff21() {
        assertEquals(19, Problems.fourDiff21(38));
    }

    @Test
    public void fiveInTrouble() {
    assertTrue(true, Problems.fiveInTrouble(true, 5));
        assertTrue(String.valueOf(true), Problems.fiveInTrouble(true, 21)); // computer generated. thought Id try
        //got rid of error.

    }
    @Test
    public void sixHelloName () {
    assertEquals("Hello Bob!", Problems.sixHelloName("Hello" + Bob + "!");
    }

    @Test

    public void sevenMakeAbba() {
        assertEquals("Hello", Problems.sevenMakeAbba(a + b+ b+ a);

    }

    @Test
    public void  eightMakeTags () {
        assertEquals("<<yo>>", Problems.eightMakeTags("<" + tag + ">" + yo + "<" + "/" + tag + ">";)
    }

    @Test
    public void nineMakeOutWord() {
    assertEquals("cupajoe", Problems.nineMakeOutWord(a + word + b);
    }

    @Test
    public void tenNearHundred() {
    assertTrue(99, Problems.tenNearHundred(89);
    }

}


