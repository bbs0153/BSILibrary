package com.bsi.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstTest {

    @Test
    public void getStr(){
        String str = "123";
        StringBuffer sb = new StringBuffer(str);
        Assertions.assertEquals("321",sb.reverse().toString());
    }

}