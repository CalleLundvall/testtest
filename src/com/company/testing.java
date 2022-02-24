package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testing {

    @Test

    public void testEng() {

        //Arrange
        Decoder decode = new Decoder();

        //Act

        String actual = decode.engChar();

        //Assert

        String expected = "a";

        assertEquals(expected, actual);
    }

    @Test

    public void testMorseCode() {

        //Arrange
        Decoder decode = new Decoder();

        //Act
        String actual = decode.morsecodez();

        //Assert
        String expected = "*-";

        assertEquals(expected, actual);

    }

    @Test
    public void testEngToMorse(){

        //Arrange
        Decoder decode = new Decoder();
        String A = "A";
        String morseValue = Decoder.getMorseCodes(A);

        //Act

        String actual = decode.getMorseCodes(decode.getMorseCode(morseValue));

       //Assert

        String expected = "*-";
        assertEquals(expected, actual);



    }




}
