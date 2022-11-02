package com.bsi.string;

public class First {

    public String getStr(){
        String str = "123";
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
}
