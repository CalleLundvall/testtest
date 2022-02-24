package com.company;

import java.util.HashMap;

public class Decoder {

    private HashMap<String, String> morseCodes;
    private static HashMap<String,String> morseCodesTest;

    public Decoder() {
        morseCodesTest = new HashMap<String, String>();
        morseCodesTest.put("A","*-");

        morseCodes = new HashMap<String, String>();
        morseCodes.put("A", "*-");
        morseCodes.put("B", "-***");
        morseCodes.put("C", "*-*");
        morseCodes.put("D", "-**");
        morseCodes.put("E", "*");
        morseCodes.put("F", "**-*");
        morseCodes.put("G", "--*");
        morseCodes.put("H", "****");
        morseCodes.put("I", "**");
        morseCodes.put("J", "*---");
        morseCodes.put("K", "-*-");
        morseCodes.put("L", "*-**");
        morseCodes.put("M", "--");
        morseCodes.put("N", "-*");
        morseCodes.put("O", "---");
        morseCodes.put("P", "*--*");
        morseCodes.put("Q", "--*-");
        morseCodes.put("R", "*-*.");
        morseCodes.put("S", "***");
        morseCodes.put("T", "-");
        morseCodes.put("U", "**-");
        morseCodes.put("V", "***-");
        morseCodes.put("W", "*--");
        morseCodes.put("X", "-**-");
        morseCodes.put("Y", "-*--");
        morseCodes.put("Z", "--**");
        morseCodes.put("1", "*----");
        morseCodes.put("2", "**---");
        morseCodes.put("3", "***--");
        morseCodes.put("4", "****-");
        morseCodes.put("5", "*****");
        morseCodes.put("6", "-****");
        morseCodes.put("7", "--***");
        morseCodes.put("8", "---**");
        morseCodes.put("9", "----*");
        morseCodes.put("0", "-----");
        morseCodes.put(".", "*-*-*-");
        morseCodes.put(",", "--**--");
        morseCodes.put("?", "**--**");

        morseCodes.put("*-", "A");
        morseCodes.put("-***", "B");
        morseCodes.put("*-*", "C");
        morseCodes.put("-**", "D");
        morseCodes.put("*", "E");
        morseCodes.put("**-*", "F");
        morseCodes.put("--*", "G");
        morseCodes.put("****", "H");
        morseCodes.put("**", "I");
        morseCodes.put("*---", "J");
        morseCodes.put("-*-", "K");
        morseCodes.put("*-**", "L");
        morseCodes.put("--", "M");
        morseCodes.put("-*", "N");
        morseCodes.put("---", "O");
        morseCodes.put("*--*", "P");
        morseCodes.put("--*-", "Q");
        morseCodes.put("-*-.", "R");
        morseCodes.put("***", "S");
        morseCodes.put("-", "T");
        morseCodes.put("**-", "U");
        morseCodes.put("***-", "V");
        morseCodes.put("*--", "W");
        morseCodes.put("-**-", "X");
        morseCodes.put("-*--", "Y");
        morseCodes.put("--**", "Z");
        morseCodes.put("*----", "1");
        morseCodes.put("**---", "2");
        morseCodes.put("***--", "3");
        morseCodes.put("****-", "4");
        morseCodes.put("*****", "5");
        morseCodes.put("-****", "6");
        morseCodes.put("--***", "7");
        morseCodes.put("---**", "8");
        morseCodes.put("----*", "9");
        morseCodes.put("-----", "0");
        morseCodes.put("*-*-*-", ".");
        morseCodes.put("--**--", ",");
        morseCodes.put("**--**", "?");
    }

    public String getMorseCode(String letter) {
        return morseCodes.get(letter);
    }


    public static String getMorseCodes(String eng) {
        return morseCodesTest.get(eng);
    }


    public String engChar() {
        return "A";
    }

    public String morsecodez() {
        return "*-";
    }
}





